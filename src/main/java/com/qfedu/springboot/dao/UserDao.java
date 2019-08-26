package com.qfedu.springboot.dao;

import com.qfedu.springboot.entity.User;

public interface UserDao {

    public User findByPhone(String phone);
}
