package com.ecp.ecommerceproject.DDD.domain.exceptions;

public class ProductNotFoundException extends Exception{

    public ProductNotFoundException (String text){
        super(text);
    }

}
