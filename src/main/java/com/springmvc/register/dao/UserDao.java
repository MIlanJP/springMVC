package com.springmvc.register.dao;

import com.springmvc.register.model.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

@Repository
public class UserDao {


    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<User> findAll() {
        return jdbcTemplate.query("SELECT * FROM bridgelabz.registration_details;"
                , new BeanPropertyRowMapper(User.class));
    }

    public User findById(String username) {
        return jdbcTemplate.queryForObject("select * from bridgelabz.registration_details where username=?",
                new Object[]{username}, new BeanPropertyRowMapper<User>(User.class));
    }

    public int deleteById(String username) {
        return jdbcTemplate.update("delete from bridgelabz.registration_details where username=?",
                new Object[]{username});
    }

    public int insert(User user) {
         return jdbcTemplate.update("INSERT INTO bridgelabz.registration_details (username,firstname,secondname,contactno" +
                        ",password,email) VALUES (?, ?, ?, ?, ?, ?)", user.getUsername(), user.getFirstName(),
                user.getLastName(), user.getContactNo(), user.getPassword(), user.getEmail());

    }

}
