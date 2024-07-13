package com.ecp.ecommerceproject.api.controller;

import com.ecp.ecommerceproject.api.DTO.Request.Opinion.OpinionRequestDTO;
import com.ecp.ecommerceproject.api.DTO.Response.OpinionResponseDTO;
import com.ecp.ecommerceproject.api.DTO.Response.PageableDTO;
import com.ecp.ecommerceproject.api.mapper.OpinionDTOMapper;
import com.ecp.ecommerceproject.domain.model.Opinion;
import com.ecp.ecommerceproject.domain.service.OpinionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:7070")
@RequestMapping("api/v1/opinions/")
public class OpinionController {

    OpinionService opinionService;
    OpinionDTOMapper opinionDTOMapper;

    public OpinionController(OpinionService opinionService, OpinionDTOMapper opinionDTOMapper) {
        this.opinionDTOMapper = opinionDTOMapper;
        this.opinionService = opinionService;
    }

    @GetMapping("/")
    PageableDTO getOpinions(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size, @RequestParam(required = false) Long userId, @RequestParam(required = false) Long productId) {

        // Determine the number of opinions based on provided userId and productId
        Long numberOfOpinions;
        if (userId != null && productId != null) {
            // Both userId and productId are provided
            numberOfOpinions = opinionService.usersOpinionsOnProduct(userId, productId);
        } else if (productId != null) {
            // Only productId is provided
            numberOfOpinions = opinionService.productsOpinions(productId);
        } else if (userId != null) {
            // Only userId is provided
            numberOfOpinions = opinionService.usersOpinions(userId);
        } else {
            // Neither userId nor productId is provided
            numberOfOpinions = opinionService.countAllOpinions();
        }

        List<Opinion> opinionList = opinionService.getAllOpinions(page, size, userId, productId);
        List<OpinionResponseDTO> opinionDTOList = opinionList.stream().map(opinionDTOMapper::mapToOpinionDTO).toList();
        return new PageableDTO(numberOfOpinions, opinionDTOList);


    }

    @PostMapping("/")
    OpinionResponseDTO saveOpinion(@RequestBody OpinionRequestDTO opinionRequestDTO) {
        Opinion opinion = opinionDTOMapper.mapToOpinion(opinionRequestDTO);
        opinion = opinionService.addOpinion(opinion);
        return opinionDTOMapper.mapToOpinionDTO(opinion);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<?> deleteOpinion(@PathVariable Long id) {

            opinionService.deleteOpinion(id);
            return ResponseEntity.status(200).body("Deleted.");

    }

    @GetMapping("/{id}")
    OpinionResponseDTO getOpinion(@PathVariable Long id) {
        Opinion opinion = opinionService.getOpinion(id);
        return opinionDTOMapper.mapToOpinionDTO(opinion);

    }

    @PutMapping("/{id}")
    OpinionResponseDTO updateOpinion(@PathVariable Long id, OpinionRequestDTO opinionRequestDTO){
        Opinion opinion = opinionDTOMapper.mapToOpinion(opinionRequestDTO);
        opinion = opinionService.updateOpinion(id, opinion);
        return opinionDTOMapper.mapToOpinionDTO(opinion);
    }

}
