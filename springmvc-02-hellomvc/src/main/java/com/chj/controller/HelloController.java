package com.chj.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ：chj
 * @date ：Created in 2021/11/25 19:56
 * @params :
 */
//导入一个Controller接口
public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //ModelAndView 模型和视图
        ModelAndView mv = new ModelAndView();

        //封装对象，放在ModelAndView中
        mv.addObject("msg","HelloSpringMVC!");
        //封装视图，放在ModelAndView中
        mv.setViewName("hello");//WEB-INF/jsp/hello.jsp
        return mv;
    }
}
