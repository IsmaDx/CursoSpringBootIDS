package com.login.service.app.model;

import java.lang.reflect.Type;

import lombok.Data;
import lombok.ToString;
@Data
@ToString
public class errorResponseModel {
private int code;
private ErrorType type;
private String message;
private String details;
private String Location;
}
