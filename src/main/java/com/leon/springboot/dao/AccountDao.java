package com.leon.springboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author leon
 * @version V1.0
 * @description: TODO
 * @date 2019/9/3 7:30 下午
 */
@Repository
public interface AccountDao {

    int update(@Param("money") double money, @Param("id") int id);
}
