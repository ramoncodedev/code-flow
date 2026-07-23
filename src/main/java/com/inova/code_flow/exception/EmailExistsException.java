package com.inova.code_flow.exception;

public class EmailExistsException extends RuntimeException{

    public EmailExistsException() {
        super("esse email já existe");
    }

}
