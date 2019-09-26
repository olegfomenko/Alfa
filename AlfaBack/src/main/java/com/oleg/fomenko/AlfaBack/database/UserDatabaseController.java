package com.oleg.fomenko.AlfaBack.database;

import com.oleg.fomenko.AlfaBack.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserDatabaseController {
    @Autowired
    private UsersDataBase usersDataBase;

    public void add(User user) {
        usersDataBase.save(user);
    }

    public User get(String userName) {
        return usersDataBase.findByUserName(userName);
    }
}
