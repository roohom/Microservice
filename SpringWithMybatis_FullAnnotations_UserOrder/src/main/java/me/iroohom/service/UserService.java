package me.iroohom.service;


import java.util.Date;

public interface UserService {
    public void insertUserAndOrderform(String username, String password,String name, Date birthday, String sex, String addrerss,
                                       Integer number, Date create_time, String note);
}
