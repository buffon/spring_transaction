package com.harry.transaction.service;

import com.harry.transaction.dao.model.User;

import java.util.List;

/**
 * Created by chenyehui on 17/3/19.
 */
public interface UserService {

    public List<User> getUsers();

    public boolean insert(User user);
}
