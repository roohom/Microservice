package me.iroohom.service.impl;

import me.iroohom.mapper.NewUserMapper;
import me.iroohom.service.NewUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @ClassName: NewUserServiceImpl
 * @Author: Roohom
 * @Function: 新用户产生订单的实现类
 * @Date: 2020/10/12 22:22
 * @Software: IntelliJ IDEA
 */
@Service
public class NewUserServiceImpl implements NewUserService {

    @Autowired
    private NewUserMapper newUserMapper;

    @Override
    @Transactional
    public void insertUserUserinfoAndOrderform(
            //user表
            String username, String password, String name, Date birthday, String sex, String addrerss,
            //user_info表
            Double height, Double weight, Integer married,
            //order_form表
            Integer number, Date create_time, String note) {

        newUserMapper.insertUser(username, password, name, birthday, sex, addrerss);
        newUserMapper.insertUserinfo(newUserMapper.queryLastId(),height, weight, married);
        newUserMapper.insertOrderform(newUserMapper.queryLastId(), number, create_time, note);

    }
}
