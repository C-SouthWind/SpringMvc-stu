package com.chj.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ：chj
 * @date ：Created in 2021/11/29 19:46
 * @params :
 */
public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","hello,springMvcServlet!");
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
