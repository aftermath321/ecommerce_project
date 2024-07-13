package com.ecp.ecommerceproject.domain.exceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException (String text){
        super(text);
    }
}
