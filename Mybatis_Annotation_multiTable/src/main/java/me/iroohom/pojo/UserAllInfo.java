package me.iroohom.pojo;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @ClassName: UserAllInfo
 * @Author: Roohom
 * @Function: 用户、用户信息及用户订单全信息Bean
 * @Date: 2020/10/12 21:22
 * @Software: IntelliJ IDEA
 */
@Data
public class UserAllInfo {

    private Integer id;
    private String username;
    private String password;
    private String name;
    private Date birthday;
    private String sex;
    private String address;

    private Userinfo userinfo;
    private List<Orderform> orderform;
}
