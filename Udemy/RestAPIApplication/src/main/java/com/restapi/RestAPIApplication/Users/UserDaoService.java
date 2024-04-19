package com.restapi.RestAPIApplication.Users;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;


@Component
public class UserDaoService {
    
    // DAO is data access object

    private static List<Users> users = new ArrayList<>();
    private Users emptyuser = new Users(0,"None",LocalDate.of(1111, 11, 11), null);
    private static int userId = 0;

    static{
        users.add(new Users(++userId, "Aaditya",LocalDate.now().minusYears(30), null));
        users.add(new Users(++userId, "Jack",LocalDate.now().minusYears(20), null));
        users.add(new Users(++userId, "Adam",LocalDate.now().minusYears(45), null));
        users.add(new Users(++userId, "Kennith",LocalDate.now().minusYears(25), null));
    }

    public List<Users> findAll(int id){
        return users;
    }


    public Users findOne(int id){
        for(Users x : users){
            if(x.getId() == id){
                return x;
            } 
        }
        return null;
    }


    public void deleteById(int id){
        for(int i=0;i<users.size();i++){
            if(users.get(i).getId() == id){
                users.remove(i);
                return;
            }
        }
        return;
    }




    public Users save(Users user){
        user.setId(++userId);
        users.add(user);
        return user;
    }




}
