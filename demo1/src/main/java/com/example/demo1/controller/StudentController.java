package com.example.demo1.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo1.dao.StudentDao;

import com.example.demo1.entity.Message;
import com.example.demo1.entity.Student;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@RestController
@Api(tags = "这是江哥写的类")
public class StudentController {

    @Resource
    private StudentDao studentDao;


    @ApiOperation(value = "输入学号和密码，验证信息",notes = "对了就给学生数据，错了就返回字符串")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "sid",value = "sid",dataType = "String"),
            @ApiImplicitParam(name = "pwd",value = "pwd",dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code = 123,message = "登录信息有误！"),
            @ApiResponse(code = 200,message = "成功")
    })
    @PostMapping(value = "denglu")
    public Message login(@RequestParam("sid")int sid, @RequestParam("pwd")String pwd){
        Student student=studentDao.getStu(sid, pwd);
        Message message=new Message();
        if (null==student){
            message.setCode("123");
            message.setMsg("登录信息有误！");
        }else{
            message.setCode("200");
            message.setMsg(JSON.toJSONString(student));
        }
        return message;
    }





}
