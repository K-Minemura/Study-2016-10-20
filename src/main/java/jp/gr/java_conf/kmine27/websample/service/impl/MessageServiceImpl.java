package jp.gr.java_conf.kmine27.websample.service.impl;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import jp.gr.java_conf.kmine27.websample.exception.ApplicationException;
import jp.gr.java_conf.kmine27.websample.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {

    @Value("${message.service.file.dir}")
    private String fileDir;

    @Override
    public String createMessage(String message) throws ApplicationException {
        String filePath = fileDir + "message.txt";
        StringBuilder customMessage = new StringBuilder();
        
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath), Charset.defaultCharset()));) {
            String line;
            while ((line = br.readLine()) != null) {
                customMessage.append(line).append(" ");
            }
        } catch (IOException e) {
            throw new ApplicationException(e);
        }
        return customMessage.append(message).toString();
    }

}
