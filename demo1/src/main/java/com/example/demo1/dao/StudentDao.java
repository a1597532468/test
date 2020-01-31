package com.example.demo1.dao;

import com.example.demo1.entity.Student;

import org.apache.ibatis.annotations.Param;

public interface StudentDao {

    Student getStu(@Param("sid") int sid, @Param("pwd") String pwd);
}
