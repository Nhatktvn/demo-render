package com.minhnhat.demodocker.demodocker.repository;

import com.minhnhat.demodocker.demodocker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
