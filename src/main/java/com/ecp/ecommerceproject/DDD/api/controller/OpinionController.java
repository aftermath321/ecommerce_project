package com.ecp.ecommerceproject.DDD.api.controller;

import com.ecp.ecommerceproject.DDD.api.DTO.Response.AllOpinionDTO;
import com.ecp.ecommerceproject.DDD.api.DTO.Response.OpinionDTO;
import com.ecp.ecommerceproject.DDD.api.mapper.OpinionDTOMapper;
import com.ecp.ecommerceproject.DDD.domain.exceptions.OpinionNotFoundException;
import com.ecp.ecommerceproject.DDD.domain.model.Opinion;
import com.ecp.ecommerceproject.DDD.domain.service.OpinionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:7070")
@RequestMapping("/v1/opinions/")
public class OpinionController {

    OpinionService opinionService;
    OpinionDTOMapper opinionDTOMapper;

    public  OpinionController (OpinionService opinionService, OpinionDTOMapper opinionDTOMapper){
        this.opinionDTOMapper = opinionDTOMapper;
        this.opinionService = opinionService;
    }

    @GetMapping("/")
    AllOpinionDTO getOpinions(@RequestParam (defaultValue = "0") int page,
                              @RequestParam (defaultValue = "10") int size){


        List<Opinion> opinionList = opinionService.getAllOpinions(page, size);
        List<OpinionDTO> opinionDTOList = opinionList.stream().map(opinionDTOMapper::mapToOpinionDTO).toList();
        return new AllOpinionDTO(opinionDTOList, opinionService.countAllOpinions());

    }

    @PostMapping("/")
    OpinionDTO saveOpinion(@RequestBody OpinionDTO requestBody){
        Opinion opinion = opinionDTOMapper.mapToOpinion(requestBody);
        opinion = opinionService.addOpinion(opinion);
        return opinionDTOMapper.mapToOpinionDTO(opinion);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<?> deleteOpinion(@PathVariable Long id){
        try{
            opinionService.deleteOpinion(id);
            return ResponseEntity.status(200).body("Deleted.");
        } catch (OpinionNotFoundException exception){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
        } catch (Exception exception){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An unexpected error has occurred");
        }
    }

    @GetMapping("/{id}")
    OpinionDTO getOpinion(@PathVariable Long id) throws OpinionNotFoundException {
        Opinion opinion = opinionService.getOpinion(id);
        return opinionDTOMapper.mapToOpinionDTO(opinion);

    }

    @PutMapping("/{id}")
    OpinionDTO updateOpinion(@PathVariable Long id, OpinionDTO requestBody) throws OpinionNotFoundException {
        Opinion opinion = opinionDTOMapper.mapToOpinion(requestBody);
        opinion = opinionService.updateOpinion(id, opinion);
        return opinionDTOMapper.mapToOpinionDTO(opinion);
    }
}
