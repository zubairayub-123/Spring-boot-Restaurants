package com.zubair.Restaurants.controller;

import com.zubair.Restaurants.model.Restaurant;
import com.zubair.Restaurants.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping("/bookrestros")
    public String bookrestro(@RequestBody() List<Restaurant> restros){
        return restaurantService.bookRestro(restros);
    }


    @GetMapping("/getrestros")
    public List<Restaurant> bookrestro(){
        return restaurantService.getRestros();
    }

    @GetMapping("/getrestro")
    public Optional<Restaurant> bookrestro(@RequestParam("restroId") Integer restroId){
        return restaurantService.getRestro(restroId);
    }

}
