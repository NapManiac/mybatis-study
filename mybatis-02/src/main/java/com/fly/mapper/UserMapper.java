package com.fly.mapper;

import com.fly.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //查询所有用户
    public List<User> selectUser();

}
