package com.chj.controller;

import com.chj.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：chj
 * @date ：Created in 2021/12/13 19:37
 * @params :
 */
@RestController
public class UserController {

    @RequestMapping("/aaa")
    public String aa(Model model){
        model.addAttribute("aaa","bbb");
        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("name = " + name + ", response = " + response);
        if ("chj".equals(name)) {
            response.getWriter().println("true");
        }else {
            response.getWriter().println("false");
        }
    }

    @RequestMapping("/getUser")
    public List<User> getUser(){
        List<User> userList = new ArrayList<User>();
        userList.add(new User(1,"chj","123456"));
        userList.add(new User(2,"zs","123"));
        userList.add(new User(3,"ls","456"));
        userList.add(new User(4,"ww","123456"));
        return userList;
    }
}
