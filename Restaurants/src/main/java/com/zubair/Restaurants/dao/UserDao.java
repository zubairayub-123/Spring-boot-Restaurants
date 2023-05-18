package com.zubair.Restaurants.dao;

import com.zubair.Restaurants.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,Integer> {

}
