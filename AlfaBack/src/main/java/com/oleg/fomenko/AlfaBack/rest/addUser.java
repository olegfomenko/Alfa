package com.oleg.fomenko.AlfaBack.rest;

import com.oleg.fomenko.AlfaBack.database.UserDatabaseController;
import com.oleg.fomenko.AlfaBack.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class addUser {
    @Autowired
    private UserDatabaseController userDatabaseController;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public User add(String userName, String userPassword) {
        User user = new User(userName, userPassword);
        userDatabaseController.add(user);
        return user;
    }
}
