package me.iroohom.dao.Impl;

import me.iroohom.dao.AccountDao;
import me.iroohom.service.Impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: AccountDaoImpl
 * @Author: Roohom
 * @Function: AccountDao实现类
 * @Date: 2020/10/11 11:01
 * @Software: IntelliJ IDEA
 */
/**
 *此注解功能用于将当前类创建对象, 然后放置spring的容器中  相当于Bean标签
 */
@Repository
public class AccountDaoImpl implements AccountDao {
    //注入普通类型
    @Value("太空银行")
    private String bankName;

    @Override
    public void out(String username, Double money) {
        System.out.println("出账步骤:"+username+"在"+bankName+","+"转出"+money);
    }

    @Override
    public void in(String username, Double money) {
        System.out.println("入账步骤:"+username+"在"+bankName+","+"转入"+money);

    }
}
