import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

/**
 * @ClassName: SpringJDBCTest
 * @Author: Roohom
 * @Function: 测试JDBC连接，能否成功创建dataSorurce
 * @Date: 2020/10/11 17:58
 * @Software: IntelliJ IDEA
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringJDBCTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void dataSourceTest() {
        System.out.println(dataSource);
    }
}
