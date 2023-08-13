package com.temzu.cafefreshmicroservices.corelib.exceptions.hadlers;

import com.temzu.cafefreshmicroservices.corelib.exceptions.TokenExpiredException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AuthenticationHandler {

  @ExceptionHandler(TokenExpiredException.class)
  public ResponseEntity<?> catchTokenExpiredException(TokenExpiredException ex) {
    return new ResponseEntity<>(new CustomError(ex.getMessage()), HttpStatus.UNAUTHORIZED);
  }
}
