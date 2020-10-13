package me.iroohom.mapper;

import me.iroohom.pojo.Orderform;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName: OrderMapper
 * @Author: Roohom
 * @Function: OrderForm查询接口
 * @Date: 2020/10/12 20:40
 * @Software: IntelliJ IDEA
 */
public interface OrderMapper {

    @Select("select * from order_form where oid = #{oid}")
    @Results({
            @Result(property = "userid",column = "user_id")
    })
    Orderform queryOrderById(Integer id);


    @Results({
            @Result(property = "userid",column = "user_id")
    })
    @Select("select * from order_form")
    List<Orderform> queryOrderAll();

}
