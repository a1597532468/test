package com.example.mint.controller;

import com.example.mint.model.entity.Admin;
import com.example.mint.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class AdminController {
    @Resource
    private AdminService as;
    @RequestMapping(value = "/adminLogin")

    public String login(String adminName, String adminPhone, HttpServletRequest request){
        Admin ad=as.loginAdmin(adminName,adminPhone);
        if(ad==null){
            return "index1";
        }
        return "index1";
    }
}
