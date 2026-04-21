package com.expresso.api_training.commons;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.time.LocalDateTime;

public record ResponseData<T>(
        LocalDateTime timestamp,
        int status,
        String message,
        @JsonInclude(JsonInclude.Include.NON_NULL)
        T data
) {
    // Construtor auxiliar para facilitar o uso
    public static <T> ResponseData<T> success(T data, String message) {
        return new ResponseData<>(LocalDateTime.now(), 200, message, data);
    }

    public static <T> ResponseData<T> error(int status, String message) {
        return new ResponseData<>(LocalDateTime.now(), status, message, null);
    }
}

// Esse Record serve para pradronizar as responses dessa api, todas as responses devem encaixar nele