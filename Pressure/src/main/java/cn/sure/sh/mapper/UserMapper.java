package cn.sure.sh.mapper;

import cn.sure.sh.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    List<User> selectAllUsers();
}
