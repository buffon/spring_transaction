package com.harry.transaction.service;

import com.harry.transaction.dao.model.User;
import com.harry.transaction.dao.model.UserBankCard;

/**
 * Created by chenyehui on 17/3/19.
 */
public interface BusinessService {

    public void insert(User user, UserBankCard userBankCard);
}
