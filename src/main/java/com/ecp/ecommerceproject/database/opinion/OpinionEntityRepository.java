package com.ecp.ecommerceproject.database.opinion;

import com.ecp.ecommerceproject.domain.model.Opinion;
import com.ecp.ecommerceproject.domain.repository.OpinionRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

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
    public List<Opinion> getAllOpinions(int page, int size, Long userId, Long productId) {
        Pageable pageable = PageRequest.of(page, size);
        Page<OpinionEntity> opinionEntityPage = opinionEntityJPARepository.findAllOpinions(userId, productId, pageable);
        return opinionEntityPage.stream().map(opinionEntityMapper::mapToOpinion).toList();
    }

    @Override
    public Long productsOpinions(Long productId) {
        return opinionEntityJPARepository.countOpinionsOnProduct(productId);
    }

    @Override
    public Long usersOpinions(Long userId) {
        return opinionEntityJPARepository.countUsersOpinions(userId);
    }

    @Override
    public Long usersOpinionsOnProduct(Long userId, Long productId) {
        return opinionEntityJPARepository.countUsersOpinionOnProduct(userId, productId);
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
