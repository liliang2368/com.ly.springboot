package com.yc.projects.yc74ibike.service.impl;

import com.yc.projects.yc74ibike.dao.Interface.UserMapper;
import com.yc.projects.yc74ibike.dao.bo.User;
import com.yc.projects.yc74ibike.service.Interface.IUserBusisv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Component
@Transactional
public class UserBusisvImpl  implements IUserBusisv {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int insertUser(User user) {
        return userMapper.insert(user);
    }
}
