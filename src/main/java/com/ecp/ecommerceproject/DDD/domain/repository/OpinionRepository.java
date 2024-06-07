package com.ecp.ecommerceproject.DDD.domain.repository;

import com.ecp.ecommerceproject.DDD.domain.model.Opinion;

import java.util.List;
import java.util.Optional;

public interface OpinionRepository {
    Long countOpinions();

    List<Opinion> getAllOpinions(int page, int size);

    Opinion addOpinion(Opinion opinion);

    void deleteOpinion(Long id);

    Optional<Opinion> getOpinion(Long id);

    Opinion updateOpinion(Opinion oldOpinion);
}
