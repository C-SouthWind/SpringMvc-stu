package com.chj.controller;

import com.chj.pojo.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ：chj
 * @date ：Created in 2021/12/6 19:38
 * @params :
 */
@Controller
public class UserController {
    @RequestMapping("/j1")
    @ResponseBody//它就不会走视图解析器，会直接返回一个字符串
    public String json() throws JsonProcessingException {
        //ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        User chj = new User("chj", 1, "23");
        return mapper.writeValueAsString(chj);
    }
}
