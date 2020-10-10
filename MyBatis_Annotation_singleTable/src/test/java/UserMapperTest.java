import me.iroohom.mapper.UserMapper;
import me.iroohom.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
    public void queryUserByUsernameAndPassword() {
        User user = userMapper.queryUserByUsernameAndPassword("zhangsan", "123456");
        System.out.println("=========================================");
        System.out.println(user);
        System.out.println("=========================================");
    }

    @Test
    public void queryUserById() {
        User user = userMapper.queryUserById(2);
        System.out.println("=====================================");
        System.out.println(user);
        System.out.println("=====================================");
    }

    @Test
    public void queryAll() {
        List<User> userList = userMapper.queryAll();
        System.out.println("=====================================");
        for (User user : userList) {
            System.out.println(user);
        }
        System.out.println("=====================================");
    }


    @Test
    public void inserUser() {
        User user = new User();
        user.setUsername("wangdaqiang");
        user.setPassword("9999999");
        user.setName("王大强");
        user.setSex("女");
        user.setBirthday(new Date());
        user.setAddress("安徽省");
        Integer affectedRows = userMapper.insertUser(user);
        System.out.println("===========================================================");
        System.out.println(affectedRows + " row(s) affected");
        System.out.println("===========================================================");
    }

    @Test
    public void updateUser() {
        User user = userMapper.queryUserById(9);
        user.setUsername("zhangdaqiang");
        user.setName("张大强");
        Integer affectedRows = userMapper.updateUser(user);
        System.out.println("===========================================================");
        System.out.println(affectedRows + " row(s) affected");
        System.out.println("===========================================================");
    }

    @Test
    public void delById()
    {
        Integer affectedRows = userMapper.delUserById(9);
        System.out.println("===========================================================");
        System.out.println(affectedRows + " row(s) affected");
        System.out.println("===========================================================");
    }

    @After
    public void close() {
        sqlSession.close();
    }

}