package me.iroohom.service;

/**
 * @ClassName: AccountService
 * @Author: Roohom
 * @Function:
 * @Date: 2020/10/11 10:33
 * @Software: IntelliJ IDEA
 */
public interface AccountService {


    public void transfer(String outUserName, String inUserName, double money);
}
