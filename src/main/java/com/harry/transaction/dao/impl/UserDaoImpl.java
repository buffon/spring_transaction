package com.harry.transaction.dao.impl;

import com.harry.transaction.dao.UserDao;
import com.harry.transaction.dao.mapping.UserMapper;
import com.harry.transaction.dao.model.User;
import com.harry.transaction.dao.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by chenyehui on 17/3/19.
 */
@Component
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUsers() {
        return userMapper.selectByExample(new UserExample());
    }

    @Override
    public boolean insert(User user) {
        return 1 == userMapper.insertSelective(user);
    }
}
