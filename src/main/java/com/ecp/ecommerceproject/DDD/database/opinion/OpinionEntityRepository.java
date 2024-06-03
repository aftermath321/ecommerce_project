package com.ecp.ecommerceproject.DDD.database.opinion;

import com.ecp.ecommerceproject.DDD.domain.repository.OpinionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class OpinionEntityRepository implements OpinionRepository {

    private final OpinionEntityJPARepository opinionEntityJPARepository;
    private final OpinionEntityMapper opinionEntityMapper;


}
