package com.rest.examples.actuatorexample.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.examples.actuatorexample.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
