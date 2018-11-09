package com.xc.ssm.controller;

import com.xc.ssm.model.User;
import org.springframework.web.bind.annotation.ModelAttribute;

public interface UserController {

    String login(@ModelAttribute User user);

    String toLogin(@ModelAttribute User user);
}
