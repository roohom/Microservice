import me.iroohom.dao.AccountDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName: SpringDaoTest
 * @Author: Roohom
 * @Function: Spring基础测试
 * @Date: 2020/10/11 09:57
 * @Software: IntelliJ IDEA
 */
//指定Spring的测试运行环境
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDaoTest {

    //自动注入
    @Autowired
    //强制使用名称来注入
    @Qualifier("accountDao")
    private AccountDao accountDao;

    @Test
    public void SimpleTest() {
        accountDao.out("王大强", (double) 200);
        accountDao.in("李大姐", (double) 200);
    }
}
