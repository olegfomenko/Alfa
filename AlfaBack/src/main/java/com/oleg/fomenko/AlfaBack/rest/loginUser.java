package com.oleg.fomenko.AlfaBack.rest;

import com.oleg.fomenko.AlfaBack.answers.Answer;
import com.oleg.fomenko.AlfaBack.check.CheckPermission;
import com.oleg.fomenko.AlfaBack.database.UserDatabaseController;
import com.oleg.fomenko.AlfaBack.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class loginUser {
    /**База данных пользователей*/
    @Autowired
    private UserDatabaseController userDatabaseController;

    @Autowired
    private CheckPermission checkPermission;

    @CrossOrigin
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Answer login(@RequestBody User user) {
        System.out.println(user.getUserName() + " " + user.getUserPassword());
        if(checkPermission.check(user.getUserName(), user.getUserPassword())) {
            return Answer.getOkAnswer("It's OK!");
        } else {
            return Answer.getWrongAnswer("Wrong login or password!");
        }
    }
}
