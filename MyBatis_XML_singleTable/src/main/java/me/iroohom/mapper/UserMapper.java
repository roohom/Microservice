package me.iroohom.mapper;

import me.iroohom.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.List;

/**
 * @ClassName: UserMapper
 * @Author: Roohom
 * @Function:
 * @Date: 2020/10/10 16:49
 * @Software: IntelliJ IDEA
 */
public interface UserMapper {
    // 根据用户名和密码查询用户信息
    public User queryUserByUsernameAndPassword(@Param("uname") String username,
                                               @Param("upwd") String password);

    //通过id查询user
    public User queryUserById(@Param("id") Integer id);

    //查询所有User
    public List<User> queryAll();

    //添加用户
    public Integer insertUser(User user);

    //修改用户
    public Integer updateUser(User user);

    //删除用户
    public Integer delUserById(@Param("id") Integer id);

}
