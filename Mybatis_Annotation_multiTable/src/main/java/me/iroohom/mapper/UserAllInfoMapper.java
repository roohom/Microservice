package me.iroohom.mapper;

import me.iroohom.pojo.Orderform;
import me.iroohom.pojo.UserAllInfo;
import me.iroohom.pojo.Userinfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @ClassName: UserAllInfoMapper
 * @Author: Roohom
 * @Function:
 * @Date: 2020/10/12 21:21
 * @Software: IntelliJ IDEA
 */
public interface UserAllInfoMapper {

    /**
     * 根据用户ID查询用户信息
     *
     * @param id 用户ID
     * @return 用户信息Bean
     */
    @Select("select * from user_info where id = #{id}")
    Userinfo queryUserinfoById(Integer id);

    /**
     * 根据用户ID查询用户订单信息
     *
     * @param id 用户ID
     * @return 用户订单List
     */
    @Select("select * from order_form where user_id = #{user_id}")
    @Results(
            {
                    @Result(property = "userid", column = "user_id"),
                    @Result(property = "createtime", column = "create_time")
            }
    )
    List<Orderform> queryOrderFormById(Integer id);


    /**
     * 根据用户ID查询用户、用户信息及用户全部订单信息
     *
     * @param id 用户ID
     * @return 用户全部信息
     */
    @Select("select * from user where id = #{id}")
    @Results(
            {
                    @Result(id = true, property = "id", column = "id"),
                    @Result(property = "userinfo", column = "id", one = @One(select = "queryUserinfoById")),
                    @Result(property = "orderform", column = "id", many = @Many(select = "queryOrderFormById"))
            }
    )
    UserAllInfo queryUserAndAllInfo(Integer id);

}
