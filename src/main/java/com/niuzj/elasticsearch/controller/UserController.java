package com.niuzj.elasticsearch.controller;

import com.niuzj.elasticsearch.model.User;
import com.niuzj.elasticsearch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author niuzj
 * @date 2019/4/17 15:56
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    private final String SUCCESS = "success";

    @RequestMapping("/add")
    public String add(User user){
        userService.insert(user);
        return SUCCESS;
    }
}
