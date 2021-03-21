package com.example.demo.controller;

import com.example.demo.Service.UserService;
import com.example.demo.bean.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class LoginController {
    //将Service注入Web层
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

//    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
//    public String login(String name,String password){
//        UserBean userBean = userService.loginIn(name,password);
//        if(userBean!=null){
//            return "success";
//        }else {
//            return "error";
//        }
//    }
}
