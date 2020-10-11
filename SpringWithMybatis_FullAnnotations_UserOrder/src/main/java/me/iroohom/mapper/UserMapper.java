package me.iroohom.mapper;

import me.iroohom.pojo.Orderform;
import me.iroohom.pojo.User;
import me.iroohom.pojo.Userinfo;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

/**
 * @ClassName: UserMapper
 * @Author: Roohom
 * @Function: mapper
 * @Date: 2020/10/10 16:49
 * @Software: IntelliJ IDEA
 */
public interface UserMapper {


    @Insert("insert into user values(null,#{username},#{password},#{name},#{birthday},#{sex},#{address})")
    void insertUser(@Param("username") String username,@Param("password") String password,@Param("name") String name,@Param("birthday") Date birthday,@Param("sex") String sex,@Param("address") String address);

    @Select("select max(id) from user")
    Integer queryLastId();

    @Insert("insert into order_form values(null,#{user_id},#{number},#{create_time},#{note})")
    void insertOrderform(@Param("user_id") Integer user_id,@Param("number") Integer number,@Param("create_time") Date create_time,@Param("note") String note);

}
