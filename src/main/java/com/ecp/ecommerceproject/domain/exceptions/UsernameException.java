package com.ecp.ecommerceproject.domain.exceptions;

public class UsernameException extends RuntimeException{

    public UsernameException (String text){
        super(text);
    }
}
