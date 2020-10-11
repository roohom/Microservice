import me.iroohom.mapper.TbAccountMapper;
import me.iroohom.pojo.TbAcccount;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @ClassName: SpringDaoTest
 * @Author: Roohom
 * @Function: Dao测试
 * @Date: 2020/10/11 19:14
 * @Software: IntelliJ IDEA
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDaoTest {

    @Autowired
    private TbAccountMapper tbAccountMapper;


    @Test
    public void findAccountAll() {
        List<TbAcccount> accountAll = tbAccountMapper.findAccountAll();
        System.out.println(accountAll);
    }


    @Test
    public void findAccountById() {
        TbAcccount account = tbAccountMapper.findAccountById(1);
        System.out.println(account);
    }
}
