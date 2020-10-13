
import me.iroohom.mapper.OrderMapper;
import me.iroohom.pojo.Orderform;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName: OrderFormTest
 * @Author: Roohom
 * @Function: 测试类
 * @Date: 2020/10/12 20:43
 * @Software: IntelliJ IDEA
 */
public class OrderFormTest {

    SqlSession sqlSession;
    OrderMapper orderMapper;

    @Before
    public void init() throws IOException {
        InputStream resource = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
        sqlSession = sqlSessionFactory.openSession(true);
        orderMapper = sqlSession.getMapper(OrderMapper.class);
    }


    @After
    public void close() {
        sqlSession.close();
    }


    @Test
    public void queryOrderById() {
        Orderform orderform = orderMapper.queryOrderById(5);
        System.out.println(orderform);
    }


    @Test
    public void queryOrderAll() {
        List<Orderform> orderforms = orderMapper.queryOrderAll();
        System.out.println(orderforms);
    }
}
