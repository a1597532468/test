package com.example.mint.dao;

import com.example.mint.model.entity.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsDao {
    //展示商家发布的新闻
    public List<News> showNews(@Param("type") Integer type);
    //审核商家发布的新闻
    public int updateNews(@Param("id") Integer id, @Param("status") Integer status);
}
