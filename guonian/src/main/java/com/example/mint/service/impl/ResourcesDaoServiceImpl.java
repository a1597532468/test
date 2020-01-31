package com.example.mint.service.impl;

import com.example.mint.dao.ResourcesDao;
import com.example.mint.service.ResourcesDaoService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Niuys
 * @Date: 2020/1/16 10:00
 * @Describe:
 */
@Service

public class ResourcesDaoServiceImpl implements ResourcesDaoService {
    @Resource
    private ResourcesDao resourcesDao;
}
