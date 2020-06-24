package com.fly.mapper;


import com.fly.pojo.Teacher;

public interface TeacherMapper {
    //按查询嵌套处理
    public Teacher selectTeacherById1(int id);
    //按结果嵌套处理
    public Teacher selectTeacherById2(int id);
}
