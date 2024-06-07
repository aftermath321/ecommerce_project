package com.ecp.ecommerceproject.DDD.domain.service;

import com.ecp.ecommerceproject.DDD.domain.exceptions.OpinionNotFoundException;
import com.ecp.ecommerceproject.DDD.domain.model.Opinion;
import com.ecp.ecommerceproject.DDD.domain.repository.OpinionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class OpinionService {

    private OpinionRepository opinionRepository;

    public Long countAllOpinions() {
    return opinionRepository.countOpinions();
    }

    public List<Opinion> getAllOpinions(int page, int size) {
        return opinionRepository.getAllOpinions(page, size);
    }

    public Opinion addOpinion(Opinion opinion) {
        return opinionRepository.addOpinion(opinion);
    }

    public void deleteOpinion(Long id) throws OpinionNotFoundException{
        Optional<Opinion> opinion = opinionRepository.getOpinion(id);
        if (opinion.isPresent()){
            opinionRepository.deleteOpinion(id);
        } else {
            throw new OpinionNotFoundException("Opinion was not found.");
        }
    }

    public Opinion getOpinion(Long id ) throws OpinionNotFoundException {
        return opinionRepository.getOpinion(id).orElseThrow(() -> new OpinionNotFoundException("Opinion was not found."));
    }

    public Opinion updateOpinion(Long id, Opinion opinion) throws OpinionNotFoundException {
        if (opinion == null) {
            throw new IllegalArgumentException("Opinion can not be null.");
        }

        Opinion oldOpinion = opinionRepository.getOpinion(id).orElseThrow(() -> new OpinionNotFoundException("Opinion was not found."));
         if (opinion.getContent() != null){
             oldOpinion.setContent(opinion.getContent());
         }
        if (opinion.getRating() != null){
            oldOpinion.setRating(opinion.getRating());
        }
        oldOpinion.setUpdated_at(LocalDate.now());

        return opinionRepository.updateOpinion(oldOpinion);
    }
}
