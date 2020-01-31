package com.example.mint.service;

import com.example.mint.model.entity.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsService {
    //展示商家发布的新闻
    public List<News> showNews(Integer type);
    //审核商家发布的新闻
    public int updateNews(Integer id, Integer status);}
