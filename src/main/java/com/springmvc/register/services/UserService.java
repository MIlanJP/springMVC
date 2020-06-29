package com.springmvc.register.services;

import com.springmvc.register.model.User;
import com.springmvc.register.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLIntegrityConstraintViolationException;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public boolean validateUser(User user){
        User userDetails=userDao.findById(user.getUsername());
        return user.getPassword().equals(userDetails.getPassword());
    }

    public boolean insert(User user) throws SQLIntegrityConstraintViolationException {
        return userDao.insert(user);
    }
}
