package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
// STOPSHIP: 2019/9/11
@Controller
//@RestController//返回json串
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello Spring Boot";
    }

    @RequestMapping("/getAllUser")
    public String getAllUser(Model model) {
        List<String> allUser = new ArrayList<>();
        allUser.add("aaa");
        allUser.add("bbb");
        allUser.add("ccc");
        model.addAttribute("allUser", allUser);
        return "userList";//跳到该jsp
    }
}
