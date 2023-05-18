package com.zubair.Restaurants.service;

import com.zubair.Restaurants.model.Restaurant;

import java.util.List;
import java.util.Optional;

public interface RestaurantService {

    String bookRestro(List<Restaurant> restros);

    List<Restaurant> getRestros();

    Optional<Restaurant> getRestro(Integer restroId);
}
