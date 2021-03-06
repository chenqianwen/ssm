package com.cn.hnust.dao;

import java.util.List;

import com.cn.hnust.pojo.User;

public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);
    
    List<User> selectByIs(Integer isOpen,Integer isAva);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}