package com.harry.transaction.dao.impl;

import com.harry.transaction.dao.UserBankCardDao;
import com.harry.transaction.dao.mapping.UserBankCardMapper;
import com.harry.transaction.dao.model.UserBankCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by chenyehui on 17/3/19.
 */
@Component
public class UserBankCardDaoImpl implements UserBankCardDao {

    @Autowired
    private UserBankCardMapper userBankCardMapper;

    @Override
    public boolean insert(UserBankCard card) {
        return 1 == userBankCardMapper.insertSelective(card);
    }
}
