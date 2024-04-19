package com.restapi.RestAPIApplication.Users;

import java.net.URI;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Optional;

import javax.swing.text.html.parser.Entity;

import org.hibernate.metamodel.mapping.EntityValuedModelPart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import io.micrometer.common.lang.NonNull;



@RestController
public class UserJpaResourse {

 

    public UserDaoService service; 
    
    @Autowired
    public UserSpringDataJpaRepository repo;


    public UserJpaResourse(UserDaoService service, UserSpringDataJpaRepository repository){
        this.service = service;
        this.repo = repository;
    }

    @GetMapping("/jpa/users")
    public List<Users> retriveAllUsers(){
        return repo.findAll();
    }


     @GetMapping("/jpa/users/{Id}")
     public Users findById(@PathVariable int Id){

        try{

            Optional<Users> user = repo.findById(Id);
    
            if (user.isPresent()) {
              return user.get();
            } else {
              throw new Exception("ID : "+Id);
            }

        } catch(Exception E){
            E.printStackTrace();
        }

        return findById(Id);

     }







     @GetMapping("/jpa/users/{Id}/posts")
     public List<Posts> retrievePosts(@PathVariable int Id){

        Optional<Users> user = repo.findById(Id);


         try{
             
             user = repo.findById(Id);
    
            if (user.isPresent()) {

            } else {
              throw new Exception("ID : "+Id);
            }

        } catch(Exception E){
            E.printStackTrace();
        }

        return user.get().getPosts();

     }







    @DeleteMapping("/jpa/users/{Id}")
    public void deleteUser(@PathVariable int Id){
        repo.deleteById(Id);
    }


    @PostMapping("/jpa/users")
    public ResponseEntity<Users> create(@RequestBody Users user){
        service.save(user);

        // This is the Path
        URI location = ServletUriComponentsBuilder.fromCurrentContextPath().path("/jpa/users/{id}").buildAndExpand(user.getId()).toUri(); 

        return ResponseEntity.created(location).build();
    }

}
