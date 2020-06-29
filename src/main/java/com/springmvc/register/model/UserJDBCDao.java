package com.springmvc.register.model;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserJDBCDao {


    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate=jdbcTemplate;
    }

    public List<User> findAll(){
        return jdbcTemplate.query("SELECT * FROM bridgelabz.registration_details;"
                ,new BeanPropertyRowMapper(User.class));
    }

    public User findById(String username){
        return jdbcTemplate.queryForObject("select * from bridgelabz.registration_details where username=?",
                new Object[]{username},new BeanPropertyRowMapper<User>(User.class));
    }

    public int deleteById(String username){
        return jdbcTemplate.update("delete from bridgelabz.registration_details where username=?",
                new Object[]{username});
    }

}
