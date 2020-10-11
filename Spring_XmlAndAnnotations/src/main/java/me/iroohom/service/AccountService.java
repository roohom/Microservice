package me.iroohom.service;

/**
 * @ClassName: AccountService
 * @Author: Roohom
 * @Function: AccountService接口 用于后续定义服务函数
 * @Date: 2020/10/11 10:33
 * @Software: IntelliJ IDEA
 */
public interface AccountService {
    public void transfer(String outUserName, String inUserName, double money);
}
