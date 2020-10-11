package me.iroohom.pojo;

import lombok.Data;

/**
 * @ClassName: TbAcccount
 * @Author: Roohom
 * @Function: 普通java bean
 * @Date: 2020/10/11 14:35
 * @Software: IntelliJ IDEA
 */
@Data
public class TbAcccount {

    //使用包装类而不是int，方便处理null值
    private Integer id;
    private String name;
    private Double money;
}
