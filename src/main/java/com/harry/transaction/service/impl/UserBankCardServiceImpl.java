package com.harry.transaction.service.impl;

import com.harry.transaction.dao.UserBankCardDao;
import com.harry.transaction.dao.model.UserBankCard;
import com.harry.transaction.service.UserBankCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by chenyehui on 17/3/19.
 */
@Service
public class UserBankCardServiceImpl implements UserBankCardService {

    @Autowired
    private UserBankCardDao userBankCardDao;

    @Override
    @Transactional(value = "userTransactionManager", propagation = Propagation.MANDATORY)// , propagation = Propagation.REQUIRES_NEW
    public boolean insert(UserBankCard userBankCard) {
//        if (userBankCard.getUserId() == 2) {
//            throw new RuntimeException("Transaction Error");
//        }
        userBankCard.setCreateTime(new Date());
        return userBankCardDao.insert(userBankCard);
    }
}
