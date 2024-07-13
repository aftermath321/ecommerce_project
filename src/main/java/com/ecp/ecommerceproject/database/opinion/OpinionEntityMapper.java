package com.ecp.ecommerceproject.database.opinion;

import com.ecp.ecommerceproject.domain.model.Opinion;
import org.springframework.stereotype.Component;

@Component
public class OpinionEntityMapper {
    public Opinion mapToOpinion(OpinionEntity opinionEntity) {
        return new Opinion(
                opinionEntity.getId(),
                opinionEntity.getUserId(),
                opinionEntity.getProductId(),
                opinionEntity.getContent(),
                opinionEntity.getRating(),
                opinionEntity.getCreate_at(),
                opinionEntity.getUpdated_at()

        );
    }

    public OpinionEntity mapToOpinionEntity (Opinion opinion){
        return new OpinionEntity(
                opinion.getId(),
                opinion.getUser_id(),
                opinion.getProduct_id(),
                opinion.getContent(),
                opinion.getRating(),
                opinion.getCreate_at(),
                opinion.getUpdated_at()

        );
    }
}
