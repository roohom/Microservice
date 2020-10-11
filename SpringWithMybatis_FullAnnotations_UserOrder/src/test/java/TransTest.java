import me.iroohom.conf.SpringConf;
import me.iroohom.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Date;

/**
 * @ClassName: TransTest
 * @Author: Roohom
 * @Function:
 * @Date: 2020/10/11 22:10
 * @Software: IntelliJ IDEA
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConf.class})
@EnableTransactionManagement
public class TransTest {

    @Autowired
    private UserService userService;

    @Test
    public void transTest() {
        userService.insertUserAndOrderform("SunDaqiang","678900",
                "孙大强",new Date(),"女","湖北省",
                10001007,new Date(),"测试而已");
    }
}
