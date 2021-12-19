package com.chj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：chj
 * @date ：Created in 2021/11/28 20:37
 * @params :
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","hello,SpringMvcAnnotation!");
        return "hello";
    }
}
