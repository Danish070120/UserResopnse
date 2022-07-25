package com.example.ResponseRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Response.UserResponse;

public interface UserResponseRepository extends JpaRepository<UserResponse, Integer> {

}
