package me.iroohom.service.Impl;

import me.iroohom.service.AccountService;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: AccountServiceImpl
 * @Author: Roohom
 * @Function:
 * @Date: 2020/10/11 10:52
 * @Software: IntelliJ IDEA
 */

@Repository
public class AccountServiceImpl implements AccountService {
    @Override
    public void transfer(String outUserName, String inUserName, double money) {
        System.out.println(outUserName + "转账给" + inUserName +" " +money + "元");
    }
}
