import me.iroohom.mapper.UserMapper;
import me.iroohom.pojo.Orderform;
import me.iroohom.pojo.User;
import me.iroohom.pojo.Userinfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sun.nio.cs.US_ASCII;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class UserMapperTest {

//    @Test
//    public void queryUserByUsernameAndPassword() throws IOException, IOException {
//        // 1 加载配置文件
//        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
//        // 2 sqlSessionFactory
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
//        // 3 sqlSession
//        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//        // 4 获取mapper接口的实现类
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        // 5 调用方法
//        User user = userMapper.queryUserByUsernameAndPassword("zhangsan", "123456");
//        System.out.println(" ============\n " + user);
//        // 6 释放资源
//        sqlSession.close();
//    }

    SqlSession sqlSession = null;
    UserMapper userMapper = null;

    @Before
    public void init() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        sqlSession = sqlSessionFactory.openSession(true);
        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void findUserById() {
        User user = userMapper.findUserById(2);
        System.out.println("================================================");
        System.out.println(user);
        System.out.println("================================================");
    }

    @Test
    public void findOrderFormById() {
        List<Orderform> orderForm = userMapper.findOrderFormById(2);
        System.out.println("================================================");
        System.out.println(orderForm);
        System.out.println("================================================");
    }

    @Test
    public void findUserInfoById() {
        Userinfo userinfo = userMapper.findUserinfoById(2);
        System.out.println("================================================");
        System.out.println(userinfo);
        System.out.println("================================================");
    }


    @Test
    public void findUseinfoById() {
        User userAndUserInfo = userMapper.findUserAndUserInfoById(2);
        System.out.println("================================================");
        System.out.println(userAndUserInfo);
        System.out.println("================================================");
    }

    @Test
    public void findUserAndUserinfoAndOrderformById() {
        User userOrderFormList = userMapper.findOrderFormListById(2);
        System.out.println("================================================");
        System.out.println(userOrderFormList);
        System.out.println("================================================");
    }

    @After
    public void close() {
        sqlSession.close();
    }

}