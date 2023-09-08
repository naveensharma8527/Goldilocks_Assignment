package com.goldilocks.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<ErrorDetails> EmployeeExceptionHandler( EmployeeNotFoundException employeeNotFoundException , WebRequest req){

        ErrorDetails err = new ErrorDetails();
        err.setTimestamp(LocalDateTime.now());
        err.setMessage(employeeNotFoundException.getMessage());
        err.setDetails(req.getDescription(false));

        return new ResponseEntity<ErrorDetails>(err, HttpStatus.BAD_REQUEST);

    }
}
