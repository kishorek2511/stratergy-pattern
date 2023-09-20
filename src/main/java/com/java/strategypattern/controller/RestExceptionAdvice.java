package com.java.strategypattern.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.java.strategypattern.strategy.exception.ExceptionResponseDto;
import com.java.strategypattern.strategy.exception.NotFoundNotificationStrategy;

@RestControllerAdvice
public class RestExceptionAdvice {

    @ExceptionHandler(value = NotFoundNotificationStrategy.class)
    public ResponseEntity<ExceptionResponseDto> notFoundNotificationStrategy(RuntimeException runtimeException) {
        return new ResponseEntity<>(
                ExceptionResponseDto.builder()
                        .message(runtimeException.getMessage())
                        .status(HttpStatus.NOT_FOUND)
                        .build(),
                HttpStatus.NOT_FOUND
        );
    }
}
