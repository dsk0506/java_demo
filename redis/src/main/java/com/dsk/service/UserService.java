package com.dsk.service;

import com.dsk.bean.primary.User;

import java.util.List;

/**
 * Created by dsk on 16/7/27.
 */
public interface UserService {

    public User findById(long id);

    public List<User> findAll();
    void test();
}
