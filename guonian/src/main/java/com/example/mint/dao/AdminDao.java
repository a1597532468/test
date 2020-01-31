package com.example.mint.dao;

import com.example.mint.model.entity.Admin;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AdminDao {

    Admin loginAdmin(@Param("adminName")String adminName,@Param("adminPhone")String adminPhone);
}
