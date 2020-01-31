package com.example.mint.dao;

import com.example.mint.model.entity.XiangMu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XiangMuDao {
    //增加项目
    public int addx(@Param("title")String title,@Param("content")String content,@Param("comment")String comment,@Param("status")Integer status);
//查找项目
    public List<XiangMu> list(@Param("id")Integer id,@Param("title")String title);
    //删除项目
    public int shanx(@Param("id")Integer id);
    //修改项目
    public int xiux(@Param("title")String title,@Param("content")String content,@Param("comment")String comment,@Param("status")Integer status,@Param("id")Integer id);
}
