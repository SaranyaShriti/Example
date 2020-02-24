package com.demo.practice.dao;

import org.springframework.data.repository.CrudRepository;

import com.demo.practice.model.Login;

public interface LoginRepository extends CrudRepository<Login, Integer> {

}
