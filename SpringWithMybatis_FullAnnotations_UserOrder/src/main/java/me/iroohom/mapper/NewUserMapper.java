package me.iroohom.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;

public interface NewUserMapper {

    /**
     * 插入新用户
     *
     * @param username username
     * @param password password
     * @param name     name
     * @param birthday birthday
     * @param sex      sex
     * @param address  address
     */
    @Insert("insert into user values(null,#{username},#{password},#{name},#{birthday},#{sex},#{address})")
    void insertUser(@Param("username") String username, @Param("password") String password, @Param("name") String name, @Param("birthday") Date birthday, @Param("sex") String sex, @Param("address") String address);

    /**
     * 查询得到新用户的id
     *
     * @return user_id
     */
    @Select("select max(id) from user")
    Integer queryLastId();

    /**
     * 插入用户信息
     *
     * @param height  height
     * @param weight  weight
     * @param married married
     */
    @Insert("insert into user_info values(#{id},#{height},#{weight},#{married})")
    void insertUserinfo(@Param("id") Integer id,@Param("height") Double height, @Param("weight") Double weight, @Param("married") Integer married);

    /**
     * 插入订单信息
     *
     * @param user_id     user_id
     * @param number      number
     * @param create_time create_time
     * @param note        note
     */
    @Insert("insert into order_form values(null,#{user_id},#{number},#{create_time},#{note})")
    void insertOrderform(@Param("user_id") Integer user_id, @Param("number") Integer number, @Param("create_time") Date create_time, @Param("note") String note);


}
