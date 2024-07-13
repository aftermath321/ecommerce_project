package com.ecp.ecommerceproject.api.controller;

import com.ecp.ecommerceproject.api.DTO.Response.ErrorResponseDTO;
import com.ecp.ecommerceproject.domain.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);


    @ExceptionHandler(ProductNotFoundException.class)
    @ResponseBody
    public ErrorResponseDTO handleProductNotFoundException(ProductNotFoundException exception) {
        logger.error("Product not found exception: ", exception);
        return new ErrorResponseDTO(exception.getMessage(), HttpStatus.NOT_FOUND, "Product");
    }

    @ExceptionHandler(OpinionNotFoundException.class)
    public ErrorResponseDTO handleOpinionNotFoundException(OpinionNotFoundException exception) {
        logger.error("Opinion not found exception: ", exception);
        return new ErrorResponseDTO(exception.getMessage(), HttpStatus.NOT_FOUND, "Opinion");
    }


    @ExceptionHandler(UserNotFoundException.class)
    public ErrorResponseDTO handleUserNotFoundException(UserNotFoundException exception) {
        logger.error("User not found exception: ", exception);
        return new ErrorResponseDTO(exception.getMessage(), HttpStatus.NOT_FOUND, "USER");
    }

    @ExceptionHandler(EmailException.class)
    public ErrorResponseDTO handleEmailException(EmailException exception) {
        logger.error("Email exception occurred: ", exception);
        return new ErrorResponseDTO(exception.getMessage(), HttpStatus.NOT_FOUND, "USER");
    }

    @ExceptionHandler(UsernameException.class)
    public ErrorResponseDTO handleEmailException(UsernameException exception) {
        logger.error("Username exception occurred: ", exception);
        return new ErrorResponseDTO(exception.getMessage(), HttpStatus.NOT_FOUND, "USER");
    }
}
