package com.zhonghao.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InitController {

    @RequestMapping("/init")
    @ResponseBody
    public String init() {

        return "init";
    }
}
