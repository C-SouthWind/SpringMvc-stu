package com.chj.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：chj
 * @date ：Created in 2021/12/14 20:30
 * @params :
 */
@RestController
public class UserController {

    @RequestMapping("/u1")
    public String test1(){
        return "aaaaaaaaa";
    }
}
