package com.example.mint.service.impl;

import com.example.mint.dao.NewsDao;
import com.example.mint.model.entity.News;
import com.example.mint.service.NewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Resource
    private NewsDao nd;


    @Override
    public List<News> showNews(Integer type) {
        return nd.showNews(type);
    }

    @Override
    public int updateNews(Integer id,Integer status) {
        return nd.updateNews(id,status);
    }
}
