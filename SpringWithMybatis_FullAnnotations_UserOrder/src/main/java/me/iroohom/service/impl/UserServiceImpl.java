package me.iroohom.service.impl;

import me.iroohom.mapper.UserMapper;
import me.iroohom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @ClassName: UserServiceImpl
 * @Author: Roohom
 * @Function:
 * @Date: 2020/10/11 21:48
 * @Software: IntelliJ IDEA
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    @Transactional
    public void insertUserAndOrderform(String username,String password,String name,Date birthday,String sex,String addrerss,
                                       Integer number, Date create_time, String note) {
        userMapper.insertUser(username,password,name,birthday,sex,addrerss);
        userMapper.insertOrderform(userMapper.queryLastId(),number, create_time,note);
    }

}
