package com.fly.mapper;

import com.fly.pojo.User;

import java.util.List;

public interface UserMapper {

    //查询所有用户
    public List<User> selectUser();

}
