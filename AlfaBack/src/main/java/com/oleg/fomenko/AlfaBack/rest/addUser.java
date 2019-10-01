package com.oleg.fomenko.AlfaBack.rest;

import com.oleg.fomenko.AlfaBack.database.UserDatabaseController;
import com.oleg.fomenko.AlfaBack.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class addUser {
    @Autowired
    private UserDatabaseController userDatabaseController;

    @CrossOrigin
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public User add(@RequestBody User user) {
        userDatabaseController.add(user);
        return user;
    }
}
