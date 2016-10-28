package jp.gr.java_conf.kmine27.websample.exception;

public class ApplicationException extends Exception {

    /**
     * Serial Version UID
     */
    private static final long serialVersionUID = -3388827386677398094L;

    public ApplicationException() {
        super();
    }

    public ApplicationException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(Throwable cause) {
        super(cause);
    }

}
