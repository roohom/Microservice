import me.iroohom.conf.SpringConf;
import me.iroohom.service.TbAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName: SpringServiceTransactionTest
 * @Author: Roohom
 * @Function:
 * @Date: 2020/10/11 21:07
 * @Software: IntelliJ IDEA
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConf.class})
public class SpringServiceTransactionTest {

    @Autowired
    private TbAccountService tbAccountService;

    @Test
    public void transTest()
    {
        tbAccountService.transfer("aaa","bbb",200D);
    }

}
