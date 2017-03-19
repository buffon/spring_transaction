package com.harry.transaction.controller;

import com.alibaba.fastjson.JSON;
import com.harry.transaction.dao.model.User;
import com.harry.transaction.dao.model.UserBankCard;
import com.harry.transaction.service.BusinessService;
import com.harry.transaction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chenyehui on 17/3/19.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private BusinessService businessService;

    @RequestMapping(value = "users", method = RequestMethod.GET)
    @ResponseBody
    public String getUser() {
        return JSON.toJSONString(userService.getUsers());
    }

    @RequestMapping(value = "insert/user", method = RequestMethod.GET)
    @ResponseBody
    public String insert() {
        User user = new User();
        user.setName("chenyehui");
        user.setSex(1);

        UserBankCard card = new UserBankCard();
        card.setUserId(2);

        businessService.insert(user, card);
        return "SUCCESS";
    }
}
