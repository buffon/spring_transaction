package com.harry.transaction.dao;

import com.harry.transaction.dao.model.User;

import java.util.List;

/**
 * Created by chenyehui on 17/3/19.
 */
public interface UserDao {

    List<User> getUsers();

    public boolean insert(User user);
}
