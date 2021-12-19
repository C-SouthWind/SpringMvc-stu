package com.chj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：chj
 * @date ：Created in 2021/11/29 20:41
 * @params :
 */
@Controller
@RequestMapping("/hello")
public class HelloController3 {

    @RequestMapping("/h1")
    public String test1(Model model){
        model.addAttribute("msg","test1");
        return "hello";
    }
}
