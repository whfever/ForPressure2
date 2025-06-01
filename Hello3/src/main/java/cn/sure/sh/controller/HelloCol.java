package cn.sure.sh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCol {
    @RequestMapping("/hello3")
    public String hello() {
        return "Hello3!";
    }
    @RequestMapping("/hello4")
    public String helloTwo() {
        return "Hello3";
    }
}
