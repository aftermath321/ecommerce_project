package com.ecp.ecommerceproject.controller;

import com.ecp.ecommerceproject.model.Opinion;
import com.ecp.ecommerceproject.services.OpinionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
// @CrossOrigin(origins = "http://localhost:7070")
@RequestMapping("/opinion")
public class OpinionController {

    final OpinionService opinionService;


    public OpinionController(OpinionService opinionService)
    {
        this.opinionService = opinionService;
    }

    @PostMapping("/save")
    Opinion saveOpinion (@RequestBody Opinion opinion){
        return opinionService.save(opinion);
    }

    @GetMapping("/all-opinions")
    List<Opinion> getAllOpinions(){
        return opinionService.findAll();

    }

    @GetMapping("/{id}")
    Optional<Opinion> findById(@PathVariable Long id){
        return opinionService.findByID(id);

    }
    @GetMapping("/product/{id}")
    // @CrossOrigin(origins = "http://localhost:7070")
    List<Opinion> findByProductId(@PathVariable Long id){
        return opinionService.findByProductID(id);
    }

}
