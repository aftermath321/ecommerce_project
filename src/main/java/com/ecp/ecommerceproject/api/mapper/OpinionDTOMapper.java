package com.ecp.ecommerceproject.api.mapper;

import com.ecp.ecommerceproject.api.DTO.Request.Opinion.OpinionRequestDTO;
import com.ecp.ecommerceproject.api.DTO.Response.OpinionResponseDTO;
import com.ecp.ecommerceproject.domain.model.Opinion;
import org.springframework.stereotype.Component;

@Component
public class OpinionDTOMapper {

    public Opinion mapToOpinion (OpinionRequestDTO opinionRequestDTO){
        return new Opinion(
                null,
                opinionRequestDTO.getUser_id(),
                opinionRequestDTO.getProduct_id(),
                opinionRequestDTO.getContent(),
                opinionRequestDTO.getRating(),
                opinionRequestDTO.getCreate_at(),
                opinionRequestDTO.getUpdated_at()
        );
    }

    public OpinionResponseDTO mapToOpinionDTO (Opinion opinion){
        return new OpinionResponseDTO(
                opinion.getUser_id(),
                opinion.getProduct_id(),
                opinion.getContent(),
                opinion.getRating(),
                opinion.getCreate_at(),
                opinion.getUpdated_at()
        );
    }


}
