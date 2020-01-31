package com.example.mint.service.impl;

import com.example.mint.dao.AdminDao;
import com.example.mint.model.entity.Admin;
import com.example.mint.service.AdminService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service

public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminDao ad;

    @Override
    public Admin loginAdmin(String adminName, String adminPhone) {
        return ad.loginAdmin(adminName,adminPhone);
    }
}
