package com.springmvc.register.services;

import com.springmvc.register.model.User;
import com.springmvc.register.model.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public boolean validateUser(User user){
        User userDetails=userDao.findById(user.getUsername());
        return user.getPassword().equals(userDetails.getPassword());
    }

    public void insert(User user) {
        userDao.insert(user);
    }
}
