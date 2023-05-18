package com.zubair.Restaurants.service;

import com.zubair.Restaurants.dao.RestaurantDao;
import com.zubair.Restaurants.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ImpRestaurantService implements RestaurantService{

    @Autowired
    private RestaurantDao restroDao;


    @Override
    public String bookRestro(List<Restaurant> restros) {
        restroDao.saveAll(restros);
        return "Succesfully saved restaurants"+restros.size();
    }

    @Override
    public List<Restaurant> getRestros() {
        return (List<Restaurant>)restroDao.findAll();
    }

    @Override
    public Optional<Restaurant> getRestro(Integer restroId) {
        return (Optional<Restaurant>) restroDao.findById(restroId);
    }
}
