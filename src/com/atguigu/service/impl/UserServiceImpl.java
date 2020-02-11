package com.atguigu.service.impl;

import com.atguigu.service.UserService;

/**
 * @author chenouba
 * @create 2020-02-11 19:45
 */
public class UserServiceImpl implements UserService {
    @Override
    public void insert(String username, Integer age) {
        System.out.println(username);
        System.out.println(age);
    }
}
