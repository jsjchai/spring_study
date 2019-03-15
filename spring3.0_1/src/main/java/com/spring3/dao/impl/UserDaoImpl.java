package com.spring3.dao.impl;

import com.spring3.dao.UserDao;
import com.spring3.model.User;

public class UserDaoImpl implements UserDao {

    @Override
    public void sava(User u) {

        System.out.println("user saved!");

    }

}
