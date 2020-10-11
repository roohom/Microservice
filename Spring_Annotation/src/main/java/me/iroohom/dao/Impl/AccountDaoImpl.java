package me.iroohom.dao.Impl;

import me.iroohom.dao.AccountDao;
import org.springframework.beans.factory.annotation.Value;

/**
 * @ClassName: AccountDaoImpl
 * @Author: Roohom
 * @Function:
 * @Date: 2020/10/11 11:01
 * @Software: IntelliJ IDEA
 */
public class AccountDaoImpl implements AccountDao {
    //注入普通类型
    @Value("太空银行")
    private String bankName;

    @Override
    public void out(String username, Double money) {
        System.out.println("出账步骤:" + username + "在" + bankName + "," + "转出" + money);
    }

    @Override
    public void in(String username, Double money) {
        System.out.println("入账步骤:" + username + "在" + bankName + "," + "转入" + money);

    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
