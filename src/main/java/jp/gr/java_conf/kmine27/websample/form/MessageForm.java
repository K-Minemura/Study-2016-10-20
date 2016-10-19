package jp.gr.java_conf.kmine27.websample.form;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MessageForm implements Serializable {

    private static final long serialVersionUID = 8750371619729087085L;

    @NotNull
    @Size(min = 1, max = 50)
    private String message;
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
}
