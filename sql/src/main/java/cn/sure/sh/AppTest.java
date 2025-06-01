package cn.sure.sh;

import cn.sure.sh.model.User;
import cn.sure.sh.mapper.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AppTest {
    public static void main(String[] args) {
        // 加载 Spring 上下文配置
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        // 获取 UserMapper 实例
        UserMapper userMapper = context.getBean(UserMapper.class);

        // 调用数据库方法
        List<User> users = userMapper.findAll();

        // 输出结果
        for (User user : users) {
            System.out.println(user);
        }
    }
    /**
     * 数据库交互过程
     * 调用 userMapper.findAll()
     * Spring 注入的是一个 MyBatis 生成的动态代理对象。
     * MyBatis 获取 SqlSession
     * 通过 SqlSessionFactory 获取一个会话实例。
     * 执行 SQL 查询
     * 使用 SqlSession.selectList() 方法执行 SQL。
     * 结果映射
     * 根据 resultType="cn.sure.sh.model.User" 将数据库记录映射为 Java 对象。
     * 返回结果
     * 返回 List<User> 给测试类。
     *
     */
}
