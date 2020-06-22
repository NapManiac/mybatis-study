package com.fly.mapper;

import com.fly.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //查询所有用户
    @Select("select * from user")
    public List<User> selectUser();

}
