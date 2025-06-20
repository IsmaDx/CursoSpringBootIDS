package com.login.service.app.exception;

public class unauthorizeException  extends RuntimeException {

    public unauthorizeException()
    {
        super();
    }
    public unauthorizeException(String message)
    {
        super(message);
    }
}
