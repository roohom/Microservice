package me.iroohom.pojo;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @ClassName: User
 * @Author: Roohom
 * @Function:
 * @Date: 2020/10/10 16:46
 * @Software: IntelliJ IDEA
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Date birthday;
    private String sex;
    private String address;

    private Userinfo userinfo;
    private List<Orderform> orderformList;

}
