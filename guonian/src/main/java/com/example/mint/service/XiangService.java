package com.example.mint.service;

import com.example.mint.model.entity.XiangMu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XiangService {
    public int addx(String title, String content, String comment, Integer status);
    public List<XiangMu> list(Integer id, String title);
  public int shanx(Integer id);
  public int xiux(String title, String content, String comment, Integer status, Integer id);
}
