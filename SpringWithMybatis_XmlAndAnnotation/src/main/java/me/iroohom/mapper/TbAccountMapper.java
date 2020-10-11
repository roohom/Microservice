package me.iroohom.mapper;

import me.iroohom.pojo.TbAcccount;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface TbAccountMapper {
    List<TbAcccount> findAccountAll();

    TbAcccount findAccountById(Integer id);

    void outMoney(@Param("name") String name, @Param("money") Double money);
    void inMoney(@Param("name") String name, @Param("money") Double money);

}
