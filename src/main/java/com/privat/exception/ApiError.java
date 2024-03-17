package com.privat.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@AllArgsConstructor
public class ApiError {
    private int errorCode;
    private String errorMessage;
}
