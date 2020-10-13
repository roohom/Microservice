package me.iroohom.mapper;

import com.sun.tracing.dtrace.ArgsAttributes;
import me.iroohom.pojo.Orderform;
import me.iroohom.pojo.User;
import me.iroohom.pojo.Userinfo;
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

    @Select("select * from user where id = #{id}")
    User findUserById(int id);

    @Select("select * from user_info where id = #{id}")
    Userinfo findUserinfoById(int id);

    @Select("select * from order_form where user_id = #{user_id}")
    @Results({
            @Result(property = "userid", column = "user_id"),
            @Result(property = "createtime", column = "create_time")
    })
    List<Orderform> findOrderFormById(@Param("user_id") int userId);


    @Select("select * from user where id = #{id}")
    @Results(
            {
                    @Result(id = true, property = "id", column = "id"),
                    @Result(property = "userinfo", column = "id", one = @One(select = "findUserinfoById"))
            }
    )
    User findUserAndUserInfoById(int id);


    @Select("select * from user where id = #{id}")
    @Results(
            {
                    //id代表主键，true代表是，默认false
                    @Result(id = true, property = "id", column = "id"),
                    //一对一的配置
                    //column指定数据库字段的名称，property指定实体类属性的名称，jdbcType数据库字段类型
                    @Result(property = "userinfo", column = "id", one = @One(select = "findUserinfoById")),
                    //一对多的配置
                    //column指定数据库字段的名称，property指定实体类属性的名称，jdbcType数据库字段类型
                    @Result(property = "orderformList", column = "id", many = @Many(select = "findOrderFormById"))
            }
    )
    User findOrderFormListById(int id);
}
