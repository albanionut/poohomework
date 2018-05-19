package com.unitbv.alban.licitation.service;

import com.unitbv.alban.licitation.dao.UserDao;
import com.unitbv.alban.licitation.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public Iterable<User> getAllUsers(){
        return userDao.findAll();
    }
}
