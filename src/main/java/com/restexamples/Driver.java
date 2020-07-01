package com.restexamples;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.restexamples.model.User;

import java.io.File;

public class Driver {
    public static void main(String[] args) {
        try{
            ObjectMapper mapper=new ObjectMapper();
            User user= mapper.readValue(new File("src\\main\\resources\\user.json"),User.class);
            System.out.println(user);
        }catch(Exception e){
        e.printStackTrace();
        }

    }
}
