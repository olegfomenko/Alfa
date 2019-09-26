package com.oleg.fomenko.AlfaBack.rest;

import com.oleg.fomenko.AlfaBack.answers.Answer;
import com.oleg.fomenko.AlfaBack.check.CheckPermission;
import com.oleg.fomenko.AlfaBack.database.UserDatabaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginUser {
    @Autowired
    private UserDatabaseController userDatabaseController;

    @Autowired
    private CheckPermission checkPermission;

    @CrossOrigin
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Answer login(String userName, String userPassword) {
        System.out.println(userName + " " + userPassword);
        if(checkPermission.check(userName, userPassword)) {
            return Answer.getOkAnswer("It's OK!");
        } else {
            return Answer.getWrongAnswer("Wrong login or password!");
        }
    }
}
