package com.restapi.RestAPIApplication.Users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSpringDataJpaRepository extends JpaRepository<Users,Integer> {

}
