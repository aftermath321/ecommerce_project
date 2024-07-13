package com.ecp.ecommerceproject.domain.service;

import com.ecp.ecommerceproject.domain.exceptions.OpinionNotFoundException;
import com.ecp.ecommerceproject.domain.model.Opinion;
import com.ecp.ecommerceproject.domain.repository.OpinionRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    public List<Opinion> getAllOpinions(int page, int size, Long userId, Long productId) {
        return opinionRepository.getAllOpinions(page, size, userId, productId);
    }


    public Opinion addOpinion(Opinion opinion) {
        return opinionRepository.addOpinion(opinion);
    }

    public void deleteOpinion(Long id) {
        Optional<Opinion> opinion = opinionRepository.getOpinion(id);
        if (opinion.isPresent()){
            opinionRepository.deleteOpinion(id);
        } else {
            throw new OpinionNotFoundException("Opinion was not found.");
        }
    }

    public Opinion getOpinion(Long id ) {
        return opinionRepository.getOpinion(id).orElseThrow(() -> new OpinionNotFoundException("Opinion was not found."));
    }

    public Opinion updateOpinion(Long id, Opinion opinion) {
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


    public Long productsOpinions(Long productId) {
        return opinionRepository.productsOpinions(productId);
    }

    public Long usersOpinions(Long userId) {
       return opinionRepository.usersOpinions(userId);
    }

    public Long usersOpinionsOnProduct(Long userId, Long productId) {
        return opinionRepository.usersOpinionsOnProduct(userId, productId);
    }
}
