package com.fly.mapper;

import com.fly.pojo.Teacher;

import java.util.List;

public interface TeacherMapper {
    //获取所有老师的信息
    public List<Teacher> selectTeachers();

    //以id查询
    public List<Teacher> selectTeacherById(int id);
}
