package me.iroohom.mapper;

import me.iroohom.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName: UserMapper
 * @Author: Roohom
 * @Function: 接口类
 * @Date: 2020/10/10 16:49
 * @Software: IntelliJ IDEA
 */
public interface UserMapper {
    public User findUserWithInfoById(@Param("id") int id);

    public User findUserAndOrderFormById(@Param("id") int id);
}
