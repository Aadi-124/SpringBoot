package com.restapi.RestAPIApplication.Exceptions;

import java.time.LocalDate;

import org.hibernate.annotations.NotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


// @ControllerAdvice
// public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    
//     @ExceptionHandler(Exception.class)
//     public final ResponseEntity<Object> handleExceptionEntity(Exception ex, WebRequest request){
//         ErrorDetails errorDetails = new ErrorDetails(LocalDate.now(),"Error AAla BEE!",request.getDescription(false));
//         return new ResponseEntity(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
//     }
// //


// }
