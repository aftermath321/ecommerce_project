package com.ecp.ecommerceproject.DDD.domain.service;

import com.ecp.ecommerceproject.DDD.domain.repository.OpinionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class OpinionService {

    private OpinionRepository opinionRepository;
}
