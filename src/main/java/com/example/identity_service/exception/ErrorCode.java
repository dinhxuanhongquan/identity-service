package com.example.identity_service.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized Error", HttpStatus.INTERNAL_SERVER_ERROR),
    USER_EXISTED (1111, "User already existed", HttpStatus.NOT_FOUND),
    USER_NOT_FOUND (2222, "User not found", HttpStatus.NOT_FOUND),
    USERNAME_VALIDATION (3333, "Username must be 8 characters long", HttpStatus.BAD_REQUEST),
    PASSWORD_VALIDATION (4444, "Password must be 8 characters long", HttpStatus.BAD_REQUEST),
    KEY_VALIDATION (5555, "Invalid message key", HttpStatus.BAD_REQUEST),
    AUTHENTICATED (6666, "Authentication Failed", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED (7777, "Unauthorized Failed", HttpStatus.FORBIDDEN),
    INVALID_DOB (8888, "Invalid Date Of Birth", HttpStatus.BAD_REQUEST),

    ;

    ErrorCode(int code, String message, HttpStatusCode statusCode) {
        this.code = code;
        this.message = message;
        this.statusCode = statusCode;
    }

    private final int code;
    private final String message;
    private HttpStatusCode statusCode;
}
