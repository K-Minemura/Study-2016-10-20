package jp.gr.java_conf.kmine27.websample.service.impl;

import org.springframework.stereotype.Service;

import jp.gr.java_conf.kmine27.websample.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {

    @Override
    public String createMessage(String message) {
        return "Hi ! " + message;
    }

}
