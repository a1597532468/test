package com.example.mint.service.impl;

import com.example.mint.dao.XiangMuDao;
import com.example.mint.model.entity.XiangMu;
import com.example.mint.service.XiangService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class XiangServiceImpl implements XiangService {
    @Resource
    private XiangMuDao xd;


    @Override
    public int addx(String title, String content, String comment, Integer status) {
        return xd.addx(title,content,comment,status);
    }

    @Override
    public List<XiangMu> list(Integer id, String title) {
        return xd.list(id,title);
    }

    @Override
    public int shanx(Integer id) {
        return xd.shanx(id);
    }

    @Override
    public int xiux( String title, String content, String comment, Integer status,Integer id) {
        return xd.xiux(title,content,comment,status,id);
    }
}
