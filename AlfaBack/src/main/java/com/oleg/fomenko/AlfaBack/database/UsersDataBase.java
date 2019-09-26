package com.oleg.fomenko.AlfaBack.database;

import com.oleg.fomenko.AlfaBack.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersDataBase extends JpaRepository<User, Integer> {
    User findByUserName(String name);
}

