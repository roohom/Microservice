package me.iroohom.dao.impl;

import me.iroohom.dao.AccountDao;

/**
 * @ClassName: AccountDaoImpl
 * @Author: Roohom
 * @Function: AccountDao的实现类
 * @Date: 2020/10/11 09:47
 * @Software: IntelliJ IDEA
 */
public class AccountDaoImpl implements AccountDao {
    private String bankName;

    @Override
    public void out(String username, Double money) {
        System.out.println("出账步骤:"+username+"在"+bankName+","+"转出"+money);
    }

    @Override
    public void in(String username, Double money) {
        System.out.println("入账步骤:"+username+"在"+bankName+","+"转入"+money);

    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
