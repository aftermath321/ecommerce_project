package com.ecp.ecommerceproject.DDD.database.user;

import com.ecp.ecommerceproject.DDD.domain.model.User;
import com.ecp.ecommerceproject.DDD.domain.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class UserEntityRepository implements UserRepository {

    private final UserEntityMapper userEntityMapper;
    private final UserEntityJPARepository userEntityJPARepository;

    @Override
    public User addUser(User user) {
        UserEntity userEntity = userEntityMapper.mapToEntity(user);
        userEntity = userEntityJPARepository.save(userEntity);
        return userEntityMapper.mapToUser(userEntity);
    }

    @Override
    public Optional<User> getUser(Long id) {
        Optional<UserEntity> userEntityOptional = userEntityJPARepository.findById(id);
        return userEntityOptional.map(userEntityMapper::mapToUser);
    }

    @Override
    public Long countUsers() {
        return userEntityJPARepository.count();
    }

    @Override
    public List<User> getAllUsers(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<UserEntity> userEntityPage = userEntityJPARepository.findAll(pageable);

        return userEntityPage.stream().map(userEntityMapper::mapToUser).collect(Collectors.toList());
    }

    @Override
    public void deleteUser(Long id) {
        userEntityJPARepository.deleteById(id);
    }

    @Override
    public User updateUser(User user) {
        UserEntity userEntity = userEntityMapper.mapToEntity(user);
        userEntity = userEntityJPARepository.save(userEntity);
        return userEntityMapper.mapToUser(userEntity);
    }

}
