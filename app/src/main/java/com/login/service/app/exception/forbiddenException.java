package com.login.service.app.exception;

public class forbiddenException extends RuntimeException {

public forbiddenException()
{
    super();
}
public forbiddenException(String message) {
    super(message);
}
}
