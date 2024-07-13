package com.ecp.ecommerceproject.domain.exceptions;

public class OpinionNotFoundException extends RuntimeException {

    public OpinionNotFoundException (String text){
        super(text);
    }
}
