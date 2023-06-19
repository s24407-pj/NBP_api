package com.example.nbp_api.ExceptionHandler;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.reactive.function.client.WebClientResponseException;


@RestControllerAdvice
public class AdviceController {
    @ExceptionHandler(WebClientResponseException.NotFound.class)
    public ResponseEntity<String> handleNotFound(WebClientResponseException.NotFound ex) {
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(WebClientResponseException.BadRequest.class)
    public ResponseEntity<Void> handleBadRequest(WebClientResponseException.BadRequest ex) {
        return ResponseEntity.badRequest().build();
    }
}
