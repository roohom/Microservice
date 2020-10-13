package me.iroohom.service;

import java.util.Date;

public interface NewUserService {

    public void insertUserUserinfoAndOrderform(
            //user表
            String username, String password, String name, Date birthday, String sex, String addrerss,
            //user_info表
            Double height, Double weight, Integer married,
            //order_form表
            Integer number, Date create_time, String note);
}
