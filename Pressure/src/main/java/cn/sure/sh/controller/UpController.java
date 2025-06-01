package cn.sure.sh.controller;

import cn.sure.sh.mapper.UserMapper;
import cn.sure.sh.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UpController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/up")
    public String up() {
        return "up";
    }

    @RequestMapping("/users")
    public List<User> users() {
        return userMapper.selectAllUsers();
    }
}
