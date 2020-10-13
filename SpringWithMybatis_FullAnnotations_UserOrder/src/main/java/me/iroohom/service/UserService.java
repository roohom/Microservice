package me.iroohom.service;


import java.util.Date;

public interface UserService {
    public void insertUserAndOrderform(
            //user表
            String username, String password, String name, Date birthday, String sex, String addrerss,
            //order_form表
            Integer number, Date create_time, String note);
}
