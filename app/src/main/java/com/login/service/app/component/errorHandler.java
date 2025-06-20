package com.login.service.app.component;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.login.service.app.exception.forbiddenException;
import com.login.service.app.exception.unauthorizeException;
import com.login.service.app.model.ErrorType;
import com.login.service.app.model.errorResponseModel;

@RestControllerAdvice
public class errorHandler {
@ExceptionHandler(unauthorizeException.class)
@ResponseStatus(HttpStatus.UNAUTHORIZED)

public errorResponseModel handlerUnathorizeException(HttpServletRequest req, unauthorizeException ex)
 {
    errorResponseModel errorResponse = new errorResponseModel();
    errorResponse.setCode(HttpStatus.UNAUTHORIZED.value());
    errorResponse.setType(ErrorType.ERRROR);
    errorResponse.setMessage(ex.getMessage());
    errorResponse.setDetails("not authorized");
    errorResponse.setLocation(req.getRequestURI());
    return errorResponse;
  }



@ExceptionHandler(forbiddenException.class)
@ResponseStatus(HttpStatus.FORBIDDEN)

public errorResponseModel handeUnathorizeException(HttpServletRequest req, forbiddenException ex)
 {
    errorResponseModel errorResponse = new errorResponseModel();
    errorResponse.setCode(HttpStatus.FORBIDDEN.value());
    errorResponse.setType(ErrorType.ERRROR);
    errorResponse.setMessage(ex.getMessage());
    errorResponse.setDetails("Forbidden access");
    errorResponse.setLocation(req.getRequestURI());
    return errorResponse;
  }
  
}


