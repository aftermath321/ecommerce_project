package com.ecp.ecommerceproject.controller;

import com.ecp.ecommerceproject.model.Opinion;
import com.ecp.ecommerceproject.services.OpinionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class OpinionController {

    final OpinionService opinionService;


    public OpinionController(OpinionService opinionService) {
        this.opinionService = opinionService;
    }

    @PostMapping("/opinions")
    Opinion saveOpinion (@RequestBody Opinion opinion){
        return opinionService.save(opinion);
    }

    @GetMapping("/opnions")
    List<Opinion> getAllOpinions(){
        return opinionService.findAll();

    }

    @GetMapping("/opinions/{id}")
    Optional<Opinion> findById(@PathVariable Long id){
        return opinionService.findByID(id);

    }

}
