package com.example.mint.controller;

import com.example.mint.model.entity.XiangMu;
import com.example.mint.service.XiangService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class XiangController {
@Resource
    private XiangService xs;
@RequestMapping("/add")
@ResponseBody
    public String add(XiangMu xiangMu, HttpServletRequest request){
    if(xs.addx("aaaa","bbbbb","ccccc",1)>0){
  return "1111";
    }
    return "2222";
}
@RequestMapping("/show1")
    public String show(Integer id,String title,HttpServletRequest request){
    List<XiangMu> list=xs.list(null,"移");
    request.setAttribute("list",list);
    return "index1";
}
@RequestMapping("/shanchu")
@ResponseBody
    public String shanchu(Integer id,HttpServletRequest request){
    if(xs.shanx(4)>0){
        return "1111";
    }
    return "2222";
}
@RequestMapping("/xiugai")
@ResponseBody
    public String xiugai(XiangMu xiangMu, HttpServletRequest request){
    if(xs.xiux("死吧","去死","操",2,1)>0){
        return "111";
    }
    return "222";
}
}
