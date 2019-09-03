package com.leon.springboot.controller;

import com.leon.springboot.service.AccountService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leon
 * @version V1.0
 * @description: TODO
 * @date 2019/9/3 7:55 下午
 */
@RestController
@RequestMapping("/account")
@MapperScan("com.leon.springboot.dao")
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/transfer", method = RequestMethod.GET)
    public String transfer(){
        accountService.transfer();
        return "OK";
    }
}
