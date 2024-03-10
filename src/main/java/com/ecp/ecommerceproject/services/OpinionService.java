package com.ecp.ecommerceproject.services;

import com.ecp.ecommerceproject.model.Opinion;
import com.ecp.ecommerceproject.repositories.OpinionRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OpinionService {

    private final OpinionRepo opinionRepo;

    public OpinionService(OpinionRepo opinionRepo){
        this.opinionRepo = opinionRepo;

    }

    public List<Opinion> findAll (){
        return opinionRepo.findAll();
            }

    public Opinion save (Opinion opinion){
        return opinionRepo.save(opinion);

    }

    public Optional<Opinion> findByID(Long id){
        return opinionRepo.findById(id);

    }
    public List<Opinion> findByProductID(Long id){
    return opinionRepo.findByProductID(id);
    }
    
}
