package me.iroohom.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName: Orderform
 * @Author: Roohom
 * @Function:
 * @Date: 2020/10/10 16:48
 * @Software: IntelliJ IDEA
 */
@Data
public class Orderform {
    private Integer oid;
    private Integer userid;
    private String number;
    private Date createtime;
    private String note;

}
