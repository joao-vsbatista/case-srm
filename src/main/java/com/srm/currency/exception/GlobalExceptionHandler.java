package com.srm.currency.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    
//    @ExceptionHandler(ResourceNotFoundException.class)
//    public ResponseEntity<ErrorResponse> handleResourceNotFoundException(ResourceNotFoundException ex) {
//        log.error("Resource not found: {}", ex.getMessage());
//
//        ErrorResponse error = ErrorResponse.builder()
//            .timestamp(LocalDateTime.now())
//            .status(HttpStatus.NOT_FOUND.value())
//            .error("Resource Not Found")
//            .message(ex.getMessage())
//            .build();
//
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
//    }
//
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<ErrorResponse> handleValidationExceptions(MethodArgumentNotValidException ex) {
//        Map<String, String> errors = new HashMap<>();
//        ex.getBindingResult().getAllErrors().forEach((error) -> {
//            String fieldName = ((FieldError) error).getField();
//            String errorMessage = error.getDefaultMessage();
//            errors.put(fieldName, errorMessage);
//        });
//
//        ErrorResponse error = ErrorResponse.builder()
//            .timestamp(LocalDateTime.now())
//            .status(HttpStatus.BAD_REQUEST.value())
//            .error("Validation Failed")
//            .message("Invalid input parameters")
//            .validationErrors(errors)
//            .build();
//
//        return ResponseEntity.badRequest().body(error);
//    }
//
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<ErrorResponse> handleGenericException(Exception ex) {
//        log.error("Unexpected error: {}", ex.getMessage(), ex);
//
//        ErrorResponse error = ErrorResponse.builder()
//            .timestamp(LocalDateTime.now())
//            .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
//            .error("Internal Server Error")
//            .message("An unexpected error occurred")
//            .build();
//
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
//    }
//
//    @lombok.Data
//    @lombok.Builder
//    @lombok.NoArgsConstructor
//    @lombok.AllArgsConstructor
//    public static class ErrorResponse {
//        private LocalDateTime timestamp;
//        private int status;
//        private String error;
//        private String message;
//        private Map<String, String> validationErrors;
//    }
}
