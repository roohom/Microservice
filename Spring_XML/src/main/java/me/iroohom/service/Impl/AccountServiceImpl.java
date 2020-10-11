package me.iroohom.service.Impl;

import me.iroohom.dao.AccountDao;
import me.iroohom.dao.impl.AccountDaoImpl;
import me.iroohom.service.AccountService;

/**
 * @ClassName: AccountServiceImpl
 * @Author: Roohom
 * @Function: AccountService实现类
 * @Date: 2020/10/11 10:35
 * @Software: IntelliJ IDEA
 */
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    @Override
    public void transfer(String outUserName, String inUserName, double money) {
        System.out.println(outUserName+"转账给"+inUserName+money+"元");

    }

    public void setAccountDao(AccountDaoImpl accountDao) {
        this.accountDao = accountDao;
    }
}
