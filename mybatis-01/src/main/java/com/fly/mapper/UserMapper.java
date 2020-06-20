package com.fly.mapper;

import com.fly.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //查询所有用户
    public List<User> selectUser();

    //按ID查询用户
    public User selectUserById(int id);

    //用多个参数进行查询 使用@Param
    public User selectUserByOthers1(@Param("name") String name, @Param("pwd") String pwd);

    //用多个参数进行查询 传入一个user
    public User selectUserByOthers2(User user);

    //用多个参数进行查询 按参数位置传递
    public User selectUserByOthers3(String name, String pwd);

    //使用map进行多个参数的查询
    public User selectUserByMap(Map<String, Object> map);

    //增加一个用户
    public int addUser(User user);

    //修改一个用户
    public int updateUser(User user);

    //根据id删除用户
    public int deleteUser(int id);

    //模糊查询name
    public List<User> selectLike(String likeName);


}
