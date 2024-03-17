package com.privat.exception;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException  extends RuntimeException {
    private static final int ERROR_CODE = 1;

    public UserNotFoundException(String message) {
        super(message);
    }

    public int getErrorCode() {
        return ERROR_CODE;
    }
}
