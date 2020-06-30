package com.springmvc.register.dao;

import com.springmvc.register.model.HUser;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserHibernateDao {

    SessionFactory sessionFactory=new Configuration().configure().
            addAnnotatedClass(HUser.class).buildSessionFactory();

    public void insertUser(HUser user){
        Session session=sessionFactory.getCurrentSession();
        Transaction transaction=session.beginTransaction();
        try {
            session.save(user);
            transaction.commit();
        }catch(HibernateException e){
            if(transaction!=null)transaction.rollback();
            e.printStackTrace();
        }finally{
            session.close();
        }
    }
}
