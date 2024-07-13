package com.ecp.ecommerceproject.domain.repository;

import com.ecp.ecommerceproject.domain.model.Opinion;

import java.util.List;
import java.util.Optional;

public interface OpinionRepository {
    Long countOpinions();

    List<Opinion> getAllOpinions(int page, int size, Long userId, Long productId);

    Opinion addOpinion(Opinion opinion);

    void deleteOpinion(Long id);

    Optional<Opinion> getOpinion(Long id);

    Opinion updateOpinion(Opinion oldOpinion);


    Long productsOpinions(Long productId);

    Long usersOpinions(Long userId);

    Long usersOpinionsOnProduct(Long userId, Long productId);
}
