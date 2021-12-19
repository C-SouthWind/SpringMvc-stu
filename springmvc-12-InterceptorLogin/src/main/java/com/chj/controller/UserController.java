package com.chj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author ：chj
 * @date ：Created in 2021/12/16 19:32
 * @params :
 */
@Controller
public class UserController {
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/main")
    public String main(Model model){
        model.addAttribute("msg","登录成功");
        return "main";
    }
    @RequestMapping("/goLogin")
    public String goLogin(HttpSession session, String username, String pwd){
        System.out.println("username = " + username + ", pwd = " + pwd);
        session.setAttribute("userInfo",username);
        return "main";
    }
}
