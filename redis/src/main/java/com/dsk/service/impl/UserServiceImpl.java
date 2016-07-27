package com.dsk.service.impl;

import com.dsk.bean.primary.User;
import com.dsk.repository.primary.UserRepository;
import com.dsk.service.UserService;
import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by dsk on 16/7/27.
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    @Autowired
    private UserRepository userRepository;


    public User findById(long id) {
        System.out.println("hhe");
        userRepository.save(new User("eee", 60));
        return userRepository.findOne(id);
    }


    public void test(){

    }
}
