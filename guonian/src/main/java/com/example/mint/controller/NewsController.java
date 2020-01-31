package com.example.mint.controller;

import com.example.mint.model.entity.News;
import com.example.mint.service.NewsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class NewsController {
    @Resource
    private NewsService ns;
    //查看商户发布的新闻
    @RequestMapping(value = "/show")

    public String show(Integer type, HttpServletRequest request){
        List<News> list=ns.showNews(1);
        if(list==null){
            return "";
        }
        request.setAttribute("list",list);
        return "index1";
    }
    //审核商户发布的新闻
    @RequestMapping("/update")
    @ResponseBody
    public String updateTitle(Integer id,Integer status){
        if(ns.updateNews(3,1)>0){
            return "aaa";
        }
        return "bbbb";
    }
}
