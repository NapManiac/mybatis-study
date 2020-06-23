package com.fly.mapper;

import com.fly.pojo.Student;

import java.util.List;

public interface StudentMapper {

    //获取所有学生及对应老师的信息
    public List<Student> selectStudents1();

    //获取所有学生及对应老师的信息
    public List<Student> selectStudents2();
}
