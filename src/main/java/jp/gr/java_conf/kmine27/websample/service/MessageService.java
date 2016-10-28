package jp.gr.java_conf.kmine27.websample.service;

import jp.gr.java_conf.kmine27.websample.exception.ApplicationException;

public interface MessageService {
    String createMessage(String message) throws ApplicationException;
}
