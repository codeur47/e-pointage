package com.yorosoft.epointage.repositories;

import com.yorosoft.epointage.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
