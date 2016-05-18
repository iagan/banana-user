package org.ithinking.banana.user.api.controller;

import org.ithinking.banana.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author fuchujian
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void login(String lo){

    }
}
