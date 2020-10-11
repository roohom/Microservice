package me.iroohom.service.Impl;

import me.iroohom.dao.AccountDao;
import me.iroohom.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @ClassName: AccountServiceImpl
 * @Author: Roohom
 * @Function: AccountService实现类
 * @Date: 2020/10/11 10:52
 * @Software: IntelliJ IDEA
 */

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public void transfer(String outUserName, String inUserName, double money) {
        System.out.println(outUserName + "转账给" + inUserName +" " +money + "元");

    }
}
