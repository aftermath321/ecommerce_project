package com.ecp.ecommerceproject.DDD.database.opinion;

import com.ecp.ecommerceproject.DDD.domain.model.Opinion;
import com.ecp.ecommerceproject.DDD.domain.repository.OpinionRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
@AllArgsConstructor
public class OpinionEntityRepository implements OpinionRepository {

    private final OpinionEntityJPARepository opinionEntityJPARepository;
    private final OpinionEntityMapper opinionEntityMapper;


    @Override
    public Long countOpinions() {
        return opinionEntityJPARepository.count();
    }

    @Override
    public List<Opinion> getAllOpinions(int page, int size) {
        Pageable pageable = PageRequest.of(page,size);
        Page<OpinionEntity> opnionEntityPage = opinionEntityJPARepository.findAll(pageable);

        return opnionEntityPage.stream().map(opinionEntityMapper::mapToOpinion).collect(Collectors.toList());
    }

    @Override
    public Opinion addOpinion(Opinion opinion) {
        OpinionEntity opinionEntity = opinionEntityMapper.mapToOpinionEntity(opinion);
        opinionEntity = opinionEntityJPARepository.save(opinionEntity);
        return opinionEntityMapper.mapToOpinion(opinionEntity);
    }

    @Override
    public void deleteOpinion(Long id) {
        opinionEntityJPARepository.deleteById(id);
    }

    @Override
    public Optional<Opinion> getOpinion(Long id) {
        Optional<OpinionEntity> opinionEntity = opinionEntityJPARepository.findById(id);
        return opinionEntity.map(opinionEntityMapper::mapToOpinion);
    }

    @Override
    public Opinion updateOpinion(Opinion oldOpinion) {
        OpinionEntity opinionEntity = opinionEntityMapper.mapToOpinionEntity(oldOpinion);
        opinionEntity = opinionEntityJPARepository.save(opinionEntity);
        return opinionEntityMapper.mapToOpinion(opinionEntity);
    }


}
