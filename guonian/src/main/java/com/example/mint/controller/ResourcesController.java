package com.example.mint.controller;

import com.example.mint.service.ResourcesDaoService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @Author: Niuys
 * @Date: 2020/1/16 10:02
 * @Describe:
 */
@Controller
public class ResourcesController {
    @Resource
    private ResourcesDaoService resourcesDaoService;
}
