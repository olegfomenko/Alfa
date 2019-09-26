package com.oleg.fomenko.AlfaBack.check;

import com.oleg.fomenko.AlfaBack.database.UserDatabaseController;
import com.oleg.fomenko.AlfaBack.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CheckPermission {
    @Autowired
    private UserDatabaseController userDatabaseController;

    public boolean check(String userName, String userPassword) {
        User user = userDatabaseController.get(userName);
        if(user == null) return false;
        return user.getUserPassword().equals(userPassword);
    }
}
