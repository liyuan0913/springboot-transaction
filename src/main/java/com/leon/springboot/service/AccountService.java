package com.leon.springboot.service;

import com.leon.springboot.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author leon
 * @version V1.0
 * @description: TODO
 * @date 2019/9/3 7:38 下午
 */
@Service
public class AccountService {

    @Autowired
    AccountDao accountDao;

    @Transactional
    public void transfer() throws RuntimeException{
        accountDao.update(90,1);//用户1减10块 用户2加10块
        int i=1/0; // 除零异常
        accountDao.update(110,2);
    }
}
