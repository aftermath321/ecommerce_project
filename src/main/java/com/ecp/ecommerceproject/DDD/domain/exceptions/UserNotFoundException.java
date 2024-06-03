package com.ecp.ecommerceproject.DDD.domain.exceptions;

public class UserNotFoundException extends Exception{
    public UserNotFoundException (String text){
        super(text);
    }
}
