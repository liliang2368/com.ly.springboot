package com.yc.projects.yc74ibike;

import com.yc.projects.yc74ibike.config.AppConfig;
import com.yc.projects.yc74ibike.dao.bo.User;
import com.yc.projects.yc74ibike.service.Interface.IUserBusisv;
import com.yc.projects.yc74ibike.service.impl.UserBusisvImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class test1 {

    @Test
    public void insertUser(){
        IUserBusisv iUserBusisv=new UserBusisvImpl();
        User user=new User();
        user.setPassword("123");
        user.setUrl("baidu");
        user.setUsername("liyang");
        iUserBusisv.insertUser(user);
    }



}
