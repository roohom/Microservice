import me.iroohom.conf.SpringConf;
import me.iroohom.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName: SpringXmlAnnotationTest
 * @Author: Roohom
 * @Function: 测试类
 * @Date: 2020/10/11 10:57
 * @Software: IntelliJ IDEA
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConf.class)
public class SpringAnnotationTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void transferTest() {
        accountService.transfer("Zhan", "Sun", 100D);
    }
}
