package com.yamhto.sharingsphere.controller;


import com.yamhto.sharingsphere.entity.User;
import com.yamhto.sharingsphere.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yamhto
 * @since 2020-06-02
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping("save")
    public String saveUser() {
        User user = new User();
        user.setUsername("sharing_test");
        user.setCityId(11);
        user.setSex("2");
        userService.saveOne(user);
        return "S";
    }
}
