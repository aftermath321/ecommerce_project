package com.ecp.ecommerceproject.services;

import com.ecp.ecommerceproject.application.repositories.OpinionRepo;
import com.ecp.ecommerceproject.domain.entity.Opinion;
import com.ecp.ecommerceproject.domain.entity.Product;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OpinionService {

    private final OpinionRepo opinionRepo;

    public OpinionService(OpinionRepo opinionRepo) {
        this.opinionRepo = opinionRepo;

    }

    public List<Opinion> findAll() {
        return opinionRepo.findAll();
    }

    public Opinion save(Opinion opinion) {
        return opinionRepo.save(opinion);

    }

    public Optional<Opinion> findByID(Product id) {
        return opinionRepo.findById(id);

    }

    public List<Opinion> findByProductID(Product id) {
        return opinionRepo.findByProductID(id);
    }

}
