package com.chj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：chj
 * @date ：Created in 2021/11/29 20:26
 * @params :
 */
@Controller
public class HelloController2 {

    @RequestMapping("/t2")
    public String test1(Model model){
        model.addAttribute("msg","springMvc-servlet");
        return "hello";
    }
}
