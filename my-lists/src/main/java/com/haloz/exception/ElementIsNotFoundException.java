package com.haloz.exception;

public class ElementIsNotFoundException extends RuntimeException{
    public ElementIsNotFoundException() {
    }

    public ElementIsNotFoundException(String message) {
        super(message);
    }
}
