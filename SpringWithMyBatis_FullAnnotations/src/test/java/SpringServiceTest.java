import me.iroohom.conf.SpringConf;
import me.iroohom.mapper.TbAccountMapper;
import me.iroohom.pojo.TbAcccount;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @ClassName: SpringServiceTransactionTest
 * @Author: Roohom
 * @Function:
 * @Date: 2020/10/11 20:58
 * @Software: IntelliJ IDEA
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConf.class})
public class SpringServiceTest {

    @Autowired
    private TbAccountMapper tbAccountMapper;

    @Test
    public void transTest() {
        List<TbAcccount> accountAll = tbAccountMapper.findAccountAll();
        System.out.println(accountAll);
    }


    @Test
    public void transTest01() {
        TbAcccount account = tbAccountMapper.findAccountById(1);
        System.out.println(account);
    }
}
