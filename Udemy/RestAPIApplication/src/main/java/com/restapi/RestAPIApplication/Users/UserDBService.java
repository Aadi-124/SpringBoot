package com.restapi.RestAPIApplication.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserDBService {

//    private static List<Users> users = new ArrayList<>();
//    private Users emptyuser = new Users(0,"None", LocalDate.of(1111, 11, 11));
//    private static int userId = 0;

//    static{
//        users.add(new Users(++userId, "Aaditya",LocalDate.now().minusYears(30)));
//        users.add(new Users(++userId, "Jack",LocalDate.now().minusYears(20)));
//        users.add(new Users(++userId, "Adam",LocalDate.now().minusYears(45)));
//        users.add(new Users(++userId, "Kennith",LocalDate.now().minusYears(25)));
//    }

//    public List<Users> findAll(){
//        return users;
//    }

    @Autowired
    UserSpringDataJpaRepository repository;

    public String findOne(int id){
        return repository.findById(id).toString();
    }


//    public void deleteById(int id){
//        for(int i=0;i<users.size();i++){
//            if(users.get(i).getId() == id){
//                users.remove(i);
//                return;
//            }
//        }
//        return;
//    }




//    public Users save(Users user){
//        user.setId(++userId);
//        users.add(user);
//        return user;
//    }
//



}
