package com.zubair.Restaurants.dao;

import com.zubair.Restaurants.model.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantDao extends CrudRepository<Restaurant,Integer> {

}
