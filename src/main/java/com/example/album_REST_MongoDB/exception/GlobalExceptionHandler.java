package com.example.album_REST_MongoDB.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class GlobalExceptionHandler{

    @ExceptionHandler(NameNotAllowedException.class)
    public ResponseEntity<String> NameNotAllowedError(NameNotAllowedException na){
        return new ResponseEntity<>(na.getMessage(),HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> noSuchElementError(){
        return new ResponseEntity<>("Item could not be found", HttpStatus.NO_CONTENT);
    }
}
