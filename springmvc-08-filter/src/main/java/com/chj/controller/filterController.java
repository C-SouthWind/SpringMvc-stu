package com.chj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author ：chj
 * @date ：Created in 2021/12/2 20:37
 * @params :
 */
@Controller
public class filterController {

    @GetMapping("/h1")
    public String aa(){
        return "form";
    }

    @PostMapping("/test1")
    public String test1(String name, Model model){
        model.addAttribute("msg",name);
        return "hello";
    }
}
