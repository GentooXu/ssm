package com.xc.ssm.controller.imp;

import com.xc.ssm.controller.UserController;
import com.xc.ssm.model.User;
import com.xc.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/user")
public class UserControllerImp implements UserController{

    @Autowired
    private UserService userService;

    @Override
    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    public String login(@ModelAttribute User user) {
        boolean isOK = userService.validateUser(user);
        return isOK ? "welcome": "failed";
    }

    @Override
    @RequestMapping(value = "/toLogin")
    public String toLogin(@ModelAttribute User user) {
        return "login";
    }
}
