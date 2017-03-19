package com.harry.transaction.service.impl;

import com.harry.transaction.dao.UserDao;
import com.harry.transaction.dao.model.User;
import com.harry.transaction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chenyehui on 17/3/19.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    public boolean insert(User user) {
        return userDao.insert(user);
    }
}
