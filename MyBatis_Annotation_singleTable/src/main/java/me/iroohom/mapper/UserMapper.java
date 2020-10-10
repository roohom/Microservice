package me.iroohom.mapper;

import me.iroohom.pojo.User;
import org.apache.ibatis.annotations.*;

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
    @Select("select * from user where username = #{username} and password = #{password}")
    public User queryUserByUsernameAndPassword(@Param("username") String username,
                                               @Param("password") String password);

    //通过id查询user
    @Select("select * from user where id = #{id}")
    public User queryUserById(@Param("id") Integer id);

    //查询所有User
    @Select("select * from user")
    public List<User> queryAll();

    //添加用户
    @Insert("insert into user values(null, #{username},#{password},#{name},#{birthday},#{sex},#{address})")
    public Integer insertUser(User user);

    //修改用户
    @Update("update user set passwored=#{password},address=#{address} where id=#{id}")
    public Integer updateUser(User user);

    //删除用户
    @Delete("delete from user where id = #{id}")
    public Integer delUserById(@Param("id") Integer id);

}
