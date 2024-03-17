package com.privat.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UserAlreadyExistsException extends RuntimeException {

    private static final int ERROR_CODE = 2;

    public UserAlreadyExistsException(String message) {
        super(message);
    }

    public int getErrorCode() {
        return ERROR_CODE;
    }
}
