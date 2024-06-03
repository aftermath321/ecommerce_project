package com.ecp.ecommerceproject.DDD.api.DTO.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class AllUserDTO {

    private List<UserDTO> listOfUsers;
    private Long totalUsers;

}
