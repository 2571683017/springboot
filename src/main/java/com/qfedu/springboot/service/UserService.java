package com.qfedu.springboot.service;

import com.qfedu.springboot.entity.User;

public interface UserService {
    public User login(String phone, String password);
}
