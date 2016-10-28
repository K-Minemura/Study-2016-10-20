package jp.gr.java_conf.kmine27.websample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.gr.java_conf.kmine27.websample.exception.ApplicationException;
import jp.gr.java_conf.kmine27.websample.form.MessageForm;
import jp.gr.java_conf.kmine27.websample.service.MessageService;

@Controller
public class SampleController {

    private static final String MESSAGE_KEY = "myMessage";

    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute(MESSAGE_KEY, "Hello world !!");
        if (!model.containsAttribute("messageForm")) {
            model.addAttribute("messageForm", new MessageForm());
        }
        return "index";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sample() {
        return "redirect:/";
    }
    
    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String sample(@Validated @ModelAttribute MessageForm messageForm, BindingResult result, Model model)
            throws ApplicationException {
        if (result.hasErrors()) {
            return index(model);
        }
        String message = messageService.createMessage(messageForm.getMessage());
        model.addAttribute(MESSAGE_KEY, message);
        return "index";
    }
}
