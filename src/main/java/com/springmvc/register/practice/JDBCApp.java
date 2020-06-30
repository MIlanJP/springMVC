package com.springmvc.register.practice;

import com.springmvc.register.dao.UserDao;
import com.spingmvc.config.JdbcConfigurattion;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JDBCApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext appCxt=new AnnotationConfigApplicationContext(JdbcConfigurattion.class);
        UserDao userDao =appCxt.getBean(UserDao.class);
        System.out.println(userDao.findAll());
        System.out.println(userDao.findById("auror"));
    }
}
