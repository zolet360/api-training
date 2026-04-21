package com.expresso.api_training.app.configuration;

import com.expresso.api_training.commons.ResponseData;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<ResponseData<Void>> handleNotFound(NoHandlerFoundException ex) {
        return ResponseEntity.status(404).body(
                ResponseData.error(404, "Endpoint não encontrado")
        );
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseData<Void>> handleGeneralError(Exception ex) {
        return ResponseEntity.status(500).body(
                ResponseData.error(500, "Erro interno no servidor")
        );
    }
}

// nesse Handler ele captura todas as exceptions dessa api e padroniza sua saida com o ResponseData ele é capaz disso
// atraves da anotação @RestControllerAdvice, ainda n esta prevendo muitos casos de erro, apenas 404 e 500