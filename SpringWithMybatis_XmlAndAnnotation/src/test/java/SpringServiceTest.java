import me.iroohom.service.TbAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName: SpringServiceTest
 * @Author: Roohom
 * @Function:
 * @Date: 2020/10/11 19:56
 * @Software: IntelliJ IDEA
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringServiceTest {

    @Autowired
    private TbAccountService tbAccountService;

    @Test
    public void tbAccountServiceTest() {
        tbAccountService.transfer("aaa", "bbb", 200D);
    }
}
