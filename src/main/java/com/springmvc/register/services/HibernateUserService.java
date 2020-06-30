package com.springmvc.register.services;

import com.springmvc.register.dao.UserHibernateDao;
import com.springmvc.register.model.HUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HibernateUserService {

    @Autowired
    UserHibernateDao userHibernateDao;

    public void insertUser(HUser user){
        userHibernateDao.insertUser(user);
    }

    public void deleteUser(String username){
        userHibernateDao.delete(username);
    }

    public int query(String username){
        return userHibernateDao.query(username).getId();
    }

}
