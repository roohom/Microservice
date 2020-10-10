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

/**
 * @ClassName: UserMapperTest
 * @Author: Roohom
 * @Function: 测试类
 * @Date: 2020/10/10 19:09
 * @Software: IntelliJ IDEA
 */
public class UserMapperTest {
    SqlSession sqlSession = null;
    UserMapper userMapper = null;


    @Before
    public void init() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        sqlSession = sqlSessionFactory.openSession(true);
        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    @After
    public void close() {
        sqlSession.close();
    }

    @Test
    public void findUserWithInfoById() {
        User user = userMapper.findUserWithInfoById(1);
        System.out.println("==============================================");
        System.out.println(user);
        System.out.println("==============================================");
    }

    @Test
    public void findUserAndOrderFormById()
    {
        User userAndOrderForm = userMapper.findUserAndOrderFormById(1);
        System.out.println("==============================================");
        System.out.println(userAndOrderForm);
        System.out.println("==============================================");
    }


}
