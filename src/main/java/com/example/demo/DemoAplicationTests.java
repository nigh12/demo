package com.example.demo;

import com.example.demo.Service.UserService;
import com.example.demo.bean.UserBean;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoAplicationTests {
    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        UserBean userBean = userService.loginIn("root","root");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getId());
    }
}
