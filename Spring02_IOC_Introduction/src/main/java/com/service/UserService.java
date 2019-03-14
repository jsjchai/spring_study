package com.service;

import com.dao.UserDao;
import com.model.User;

public class UserService {

    private UserDao userDao;


    public void add(User u) {
        this.userDao.save(u);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
