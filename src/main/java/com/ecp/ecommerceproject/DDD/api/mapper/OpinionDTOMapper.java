package com.ecp.ecommerceproject.DDD.api.mapper;

import com.ecp.ecommerceproject.DDD.api.DTO.Response.OpinionDTO;
import com.ecp.ecommerceproject.DDD.domain.model.Opinion;
import org.springframework.stereotype.Component;

@Component
public class OpinionDTOMapper {

    public Opinion mapToOpinion (OpinionDTO opinionDTO){
        return new Opinion(
                null,
                opinionDTO.getUser_id(),
                opinionDTO.getProduct_id(),
                opinionDTO.getContent(),
                opinionDTO.getRating(),
                opinionDTO.getCreate_at(),
                opinionDTO.getUpdated_at()
        );
    }

    public OpinionDTO mapToOpinionDTO (Opinion opinion){
        return new OpinionDTO(
                opinion.getUser_id(),
                opinion.getProduct_id(),
                opinion.getContent(),
                opinion.getRating(),
                opinion.getCreate_at(),
                opinion.getUpdated_at()
        );
    }


}
