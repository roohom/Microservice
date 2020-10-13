import me.iroohom.conf.SpringConf;
import me.iroohom.service.NewUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Date;

/**
 * @ClassName: NewUserTransTest
 * @Author: Roohom
 * @Function: 测试类
 * @Date: 2020/10/12 22:39
 * @Software: IntelliJ IDEA
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConf.class})
@EnableTransactionManagement
public class NewUserTransTest {

    @Autowired
    private NewUserService newUserService;


    @Test
    public void newUserTransTest()
    {
        newUserService.insertUserUserinfoAndOrderform("tttt","123","天天团",new Date(),"男","北京市",
                176D,128D,0,
                100034,new Date(),"测试而已");
    }


}
