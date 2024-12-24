package com.jpaexample.jpa.dao;

import org.springframework.data.repository.CrudRepository;
import com.jpaexample.jpa.entities.User;

import java.util.List;

public interface UserReposetory extends CrudRepository<User,Integer> {
    //derived query method OR Costum finding method
    public List<User> findByName(String name);
}
