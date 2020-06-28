package com.springmvc.register.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserJDBCDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<User> findAll(){
        return jdbcTemplate.query("select * from bridgelabz.registration_details"
                ,new BeanPropertyRowMapper<User>(User.class));

    }

    public User findById(int id){
        return jdbcTemplate.queryForObject("select * from bridgelabz.registration_details where id=?",
                new Object[]{id},new BeanPropertyRowMapper<User>(User.class));
    }

    public int deleteById(int id){
        return jdbcTemplate.update("delete from bridgelabz.registration_details where id=?",
                new Object[]{id});
    }


}
