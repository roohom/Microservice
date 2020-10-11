package me.iroohom.service.impl;

import me.iroohom.mapper.TbAccountMapper;
import me.iroohom.service.TbAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName: TbAccountServiceImpl
 * @Author: Roohom
 * @Function: TbAccountService实现类
 * @Date: 2020/10/11 19:50
 * @Software: IntelliJ IDEA
 */
@Service
public class TbAccountServiceImpl implements TbAccountService {

    @Autowired
    private TbAccountMapper tbAccountMapper;


    @Override
    @Transactional
    public void transfer(String outName, String inName, Double money) {
        tbAccountMapper.outMoney(outName,money);
        tbAccountMapper.inMoney(inName,money);
    }
}
