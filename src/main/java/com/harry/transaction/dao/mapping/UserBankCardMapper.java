package com.harry.transaction.dao.mapping;

import com.harry.transaction.dao.model.UserBankCard;
import com.harry.transaction.dao.model.UserBankCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBankCardMapper {
    int countByExample(UserBankCardExample example);

    int deleteByExample(UserBankCardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserBankCard record);

    int insertSelective(UserBankCard record);

    List<UserBankCard> selectByExample(UserBankCardExample example);

    UserBankCard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserBankCard record, @Param("example") UserBankCardExample example);

    int updateByExample(@Param("record") UserBankCard record, @Param("example") UserBankCardExample example);

    int updateByPrimaryKeySelective(UserBankCard record);

    int updateByPrimaryKey(UserBankCard record);
}