package cn.sure.sh.controller;

import cn.sure.sh.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/test")
    public String handleTestRequest(@RequestParam Map<String, String> params) {
        // 从 Map 中获取参数 "key"
        String value = params.get("key");
        System.out.println("Received value: " + value);
        // 返回参数值
        return "Received value: " + value;
    }
    @GetMapping("/user")
    public User handleUserRequest() {

        // 返回用户信息
        return  new User("John Doe", "password123");
    }
}

