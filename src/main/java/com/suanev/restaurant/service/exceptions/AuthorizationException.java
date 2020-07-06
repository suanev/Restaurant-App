package com.suanev.restaurant.service.exceptions;

public class AuthorizationException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public AuthorizationException(String s) {
        super(s);
    }

    public AuthorizationException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
