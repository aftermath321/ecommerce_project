package com.ecp.ecommerceproject.DDD.database.user;

import com.ecp.ecommerceproject.DDD.domain.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class UserEntityRepository extends UserRepository {

    private final UserEntityMapper userEntityMapper;
    private final UserEntityJPARepository userEntityJPARepository;
}
