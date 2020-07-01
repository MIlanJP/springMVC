package com.springmvc.register.services;

import com.springmvc.register.dao.UserHibernateDao;
import com.springmvc.register.model.HUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HibernateUserService {

    @Autowired
    UserHibernateDao userHibernateDao;

    public boolean insertUser(HUser user){
        return userHibernateDao.insertUser(user);
    }

    public int validateUser(String username){
        return userHibernateDao.query(username);
    }

}
