package me.iroohom.mapper;

import me.iroohom.pojo.TbAcccount;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


public interface TbAccountMapper {

    @Select("select * from tb_account")
    List<TbAcccount> findAccountAll();

    @Select("select * from tb_account where id = #{id}")
    TbAcccount findAccountById(Integer id);

    @Update("update tb_account set money = money - #{money} where name = #{name}")
    void outMoney(@Param("name") String name, @Param("money") Double money);
    @Update("update tb_account set money = money + #{money} where name = #{name}")
    void inMoney(@Param("name") String name, @Param("money") Double money);

}
