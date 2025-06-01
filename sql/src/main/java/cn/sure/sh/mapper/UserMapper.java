package cn.sure.sh.mapper;

import java.util.List;
import cn.sure.sh.model.User;

public interface UserMapper {
    List<User> findAll();
}
