package me.iroohom.DataSource;

import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;

/**
 * @ClassName: DruidTest
 * @Author: Roohom
 * @Function:
 * @Date: 2020/10/11 11:50
 * @Software: IntelliJ IDEA
 */
public class DruidTest {

    public static DataSource getDataSource()
    {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:///mybatis_db?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");

        return dataSource;
    }


    public static void main(String[] args) {
        DataSource dataSource = getDataSource();
        System.out.println(dataSource);
    }
}
