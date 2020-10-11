import me.iroohom.dao.AccountDao;
import me.iroohom.service.AccountService;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import sun.awt.windows.WPrinterJob;

/**
 * @ClassName: SpringServiceTest
 * @Author: Roohom
 * @Function: Service测试
 * @Date: 2020/10/11 10:42
 * @Software: IntelliJ IDEA
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringServiceTest {

    @Autowired
    @Qualifier("accountService")
    private AccountService accountService;


    @Test
    public void ServiceTest() {
        accountService.transfer("test","zhangsan",990D);
    }

}
