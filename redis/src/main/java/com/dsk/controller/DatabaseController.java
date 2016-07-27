package com.dsk.controller;

import com.alibaba.fastjson.JSONObject;
import com.dsk.bean.primary.User;
import com.dsk.repository.primary.UserRepository;
import com.dsk.repository.secondary.MessageRepository;
import com.dsk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dsk on 16/7/26.
 */
@Controller
public class DatabaseController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MessageRepository messageRepository;
    @Autowired
    private UserService UserService;

    @RequestMapping("/database")
    @ResponseBody
    public String database(){
        userRepository.save(new User("aaa", 10));
        userRepository.save(new User("bbb", 20));
        userRepository.save(new User("ccc", 30));
        userRepository.save(new User("ddd", 40));
        userRepository.save(new User("eee", 50));
        int size = userRepository.findAll().size();
        Map data = new HashMap();
        data.put("size",size);
        return JSONObject.toJSONString(data);

    }

    @RequestMapping("/service")
    @ResponseBody
    public String service(){
        User data =  UserService.findById(1);
        return JSONObject.toJSONString(data);
    }

    @RequestMapping("/servicelist")
    @ResponseBody
    public String servicelist(){
        List data =  UserService.findAll();
        return JSONObject.toJSONString(data);
    }
}


