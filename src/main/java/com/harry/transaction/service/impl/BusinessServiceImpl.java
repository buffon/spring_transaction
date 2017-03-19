package com.harry.transaction.service.impl;

import com.harry.transaction.dao.UserDao;
import com.harry.transaction.dao.model.User;
import com.harry.transaction.dao.model.UserBankCard;
import com.harry.transaction.service.BusinessService;
import com.harry.transaction.service.UserBankCardService;
import com.harry.transaction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by chenyehui on 17/3/19.
 */
@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    public UserService userService;

    @Autowired
    public UserBankCardService userBankCardService;

    @Autowired
    public UserDao userDao;

    @Override
//    @Transactional("userTransactionManager")
    public void insert(User user, UserBankCard userBankCard) {
        //userService.insert(user);
        userBankCardService.insert(userBankCard);
        user.setName("xuemin");
        insertUser(user, userBankCard);
    }

    @Transactional("userTransactionManager")
    public void insertUser(User user, UserBankCard userBankCard) {
        userBankCardService.insert(userBankCard);
        if(1 == 1){
            throw new RuntimeException("112233");
        }
        userDao.insert(user);
    }
}
