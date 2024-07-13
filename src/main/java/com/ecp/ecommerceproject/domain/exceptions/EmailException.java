package com.ecp.ecommerceproject.domain.exceptions;

public class EmailException extends RuntimeException{

    public EmailException(String text){
        super(text);
    }
}
