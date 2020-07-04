package com.suanev.restaurant.service.exceptions;

public class DataIntegrityException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DataIntegrityException(String s) {
        super(s);
    }

    public DataIntegrityException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
