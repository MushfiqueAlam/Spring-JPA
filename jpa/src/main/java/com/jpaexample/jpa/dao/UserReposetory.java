package com.jpaexample.jpa.dao;

import org.springframework.data.repository.CrudRepository;
import com.jpaexample.jpa.entities.User;
public interface UserReposetory extends CrudRepository<User,Integer> {

}
