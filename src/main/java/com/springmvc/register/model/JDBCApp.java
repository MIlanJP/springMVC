package com.springmvc.register.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JDBCApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext appCxt=new AnnotationConfigApplicationContext(JdbcConfigurattion.class);
        UserJDBCDao userJDBCDao=appCxt.getBean(UserJDBCDao.class);
        System.out.println(userJDBCDao.findAll());
        System.out.println(userJDBCDao.findById("auror"));
    }
}
