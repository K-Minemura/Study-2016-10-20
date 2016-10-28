package jp.gr.java_conf.kmine27.websample.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import jp.gr.java_conf.kmine27.websample.Application;
import jp.gr.java_conf.kmine27.websample.exception.ApplicationException;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class MessageServiceTest {

    @Autowired
    private MessageService messageService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void メッセージサービスから返却される値が正しいかの確認() throws ApplicationException {
        String result = messageService.createMessage("test !!");
        assertEquals("Message Service is not equal.", "Hi ! test !!", result);
    }
}
