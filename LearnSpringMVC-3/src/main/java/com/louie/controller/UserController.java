package com.louie.controller;

import com.alibaba.fastjson.JSON;
import com.louie.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @ResponseBody
    @RequestMapping("/1")
    public String test() {
        User user = new User("louie", 1, "basketball");
        String s = JSON.toJSONString(user);
        User user1 = JSON.parseObject(s, User.class);
        return user1.toString();
    }
}
