package com.fly.mapper;

import com.fly.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //查询所有用户
    public List<User> selectUser();

    //使用分页查询
    public List<User> selectUserByLimit(Map<String, Object> map);

    //选择全部用户RowBounds实现分页
    List<User> getUserByRowBounds();

}
