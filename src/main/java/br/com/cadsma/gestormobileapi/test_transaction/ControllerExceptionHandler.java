package br.com.cadsma.gestormobileapi.test_transaction;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler({
        Exception.class
    })
    @ResponseBody
    public ResponseEntity<String> handle(Exception exception) {
        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body("erro geral: error -> " + exception.getMessage());
    }

    @ExceptionHandler
    @ResponseBody
    public ResponseEntity<String> handle(TestException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).contentType(MediaType.APPLICATION_JSON).body("erro especifico Test: error -> " + exception.getMessage());
    }
}
