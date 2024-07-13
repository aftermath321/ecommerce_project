package com.ecp.ecommerceproject.api.DTO.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class ErrorResponseDTO {

    String message;
    HttpStatus statusCode;
    String areaOfIssue;
}
