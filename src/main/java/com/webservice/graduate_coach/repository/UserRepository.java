package com.webservice.graduate_coach.repository;

import com.webservice.graduate_coach.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    boolean existsByUserid(String userId);
    UserEntity findByUserid(String userId);
}
