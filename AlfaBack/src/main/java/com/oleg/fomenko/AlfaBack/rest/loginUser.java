package com.oleg.fomenko.AlfaBack.rest;

import com.oleg.fomenko.AlfaBack.answers.Answer;
import com.oleg.fomenko.AlfaBack.database.UserDatabaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginUser {
    @Autowired
    private UserDatabaseController userDatabaseController;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Answer login(String userName, String userPassword) {
        return null;
    }
}
