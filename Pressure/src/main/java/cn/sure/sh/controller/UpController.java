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

    @RequestMapping("/upOld")
    public String up() {
        return "up";
    }

    @RequestMapping("/users")
    public List<User> users() {
        return userMapper.selectAllUsers();
    }

    @RequestMapping("/up")
    public Boolean upEmail() {
        String id = "1"; // Example ID, replace with actual logic to get ID
        String email = null; // Initialize email variable
        List<User> users = userMapper.selectAllUsers();
       for (User user : users) {
            if (user.getId().equals(id)) {
                email = user.getEmail();
                break;
            }
        }

        int i = Integer.parseInt(email);// Example logic to parse email, replace with actual logic
        email= String.valueOf(i + 1); // Example modification, replace with actual logic to modify email
        return userMapper.upEmail(id, email);
        /**
         * 1. 乐观锁  悲观锁
         * 2. 开启事务
         */
    }
}
