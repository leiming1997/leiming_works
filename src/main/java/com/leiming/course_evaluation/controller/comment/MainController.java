package com.leiming.course_evaluation.controller.comment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//强制跳转到登录
public class MainController {
    //登录页面跳转
    @RequestMapping("/")
    public String index(){
        return "redirect:login";
    }
}
