package me.iroohom.service;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @ClassName: TbAccountService
 * @Author: Roohom
 * @Function:
 * @Date: 2020/10/11 19:48
 * @Software: IntelliJ IDEA
 */
public interface TbAccountService {

    public void transfer(String outName,String inName,Double money);
}
