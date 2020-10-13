import me.iroohom.mapper.UserAllInfoMapper;
import me.iroohom.mapper.UserMapper;
import me.iroohom.pojo.Orderform;
import me.iroohom.pojo.UserAllInfo;
import me.iroohom.pojo.Userinfo;
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
 * @ClassName: UserAllInfoTest
 * @Author: Roohom
 * @Function: 查询用户及订单全部信息测试类
 * @Date: 2020/10/12 21:29
 * @Software: IntelliJ IDEA
 */
public class UserAllInfoTest {

    SqlSession sqlSession = null;
    UserAllInfoMapper userAllInfoMapper = null;

    @Before
    public void init() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        sqlSession = sqlSessionFactory.openSession(true);
        userAllInfoMapper = sqlSession.getMapper(UserAllInfoMapper.class);
    }

    @After
    public void close() {
        sqlSession.close();
    }


    @Test
    public void queryUserinfoByIdTest() {
        Userinfo userinfo = userAllInfoMapper.queryUserinfoById(1);
        System.out.println(userinfo);
    }


    @Test
    public void queryOrderFormByIdTest() {
        List<Orderform> orderform = userAllInfoMapper.queryOrderFormById(1);
        System.out.println(orderform);
    }

    @Test
    public void queryUserAndAllInfoTest() {
        UserAllInfo userAllInfo = userAllInfoMapper.queryUserAndAllInfo(1);
        System.out.println(userAllInfo);
    }

}
