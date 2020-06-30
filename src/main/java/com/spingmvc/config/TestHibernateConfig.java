package com.spingmvc.config;

import com.springmvc.register.model.HUser;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernateConfig {

    public static void main(String[] args) {
//        Creating session Factory
        SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(HUser.class).buildSessionFactory();
//        Creating session
        Session session=sessionFactory.getCurrentSession();
        Transaction transaction=session.beginTransaction();
        try{
            HUser user=
                    new HUser("Milan","Gowda","milan@gmail.com","milan@1234","milano");
            session.save(user);
            transaction.commit();
        }catch(HibernateException e){
        if(transaction!=null) transaction.rollback();
            e.printStackTrace();
        }finally{
            session.close();
        }

    }

}
