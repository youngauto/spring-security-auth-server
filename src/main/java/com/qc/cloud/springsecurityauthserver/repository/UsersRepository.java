package com.qc.cloud.springsecurityauthserver.repository;

import com.qc.cloud.springsecurityauthserver.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByName(String username);
}
