package com.example.shardingjdbc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shardingjdbc.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
