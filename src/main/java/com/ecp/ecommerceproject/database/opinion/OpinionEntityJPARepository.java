package com.ecp.ecommerceproject.database.opinion;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OpinionEntityJPARepository extends JpaRepository<OpinionEntity, Long> {

    @Query("SELECT o FROM OpinionEntity o WHERE (:userId IS NULL OR o.userId = :userId) AND (:productId IS NULL OR o.productId = :productId)")
    Page<OpinionEntity> findAllOpinions(@Param("userId") Long userId, @Param("productId") Long productId, Pageable pageable);

    @Query("SELECT COUNT (o) FROM OpinionEntity o WHERE o.productId = :productId")
    Long countOpinionsOnProduct(@Param("productId") Long productId);

    @Query("SELECT COUNT (o) FROM OpinionEntity o WHERE o.userId = :userId")
    Long countUsersOpinions(@Param("userId") Long userId);

    @Query("SELECT COUNT (o) FROM OpinionEntity o WHERE o.productId = :productId AND o.userId = :userId")
    Long countUsersOpinionOnProduct(@Param("userId") Long userId, @Param("productId") Long productId);
}
