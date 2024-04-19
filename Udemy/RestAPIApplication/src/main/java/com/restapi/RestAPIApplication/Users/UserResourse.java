package com.restapi.RestAPIApplication.Users;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import io.micrometer.common.lang.NonNull;



@RestController
public class UserResourse {

 

    public UserDaoService service; 
    @Autowired

    // public UserDBService repo;

    public UserResourse(UserDaoService service){
        this.service = service;
    }


    @GetMapping("/users/{Id}")
    public List<Users> retrieveUser(@PathVariable int Id){
        return service.findAll(Id);
    }

    @DeleteMapping("/users/{Id}")
    public void deleteUser(@PathVariable int Id){
        service.deleteById(Id);
    }


    @PostMapping("/users")
    public ResponseEntity<Users> create(@RequestBody Users user){
        service.save(user);
        // This is the Path
        URI location = ServletUriComponentsBuilder.fromCurrentContextPath().path("/users/{id}").buildAndExpand(user.getId()).toUri(); 

        return ResponseEntity.created(location).build();
    }

}
