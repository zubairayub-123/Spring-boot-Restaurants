package com.zubair.Restaurants.service;

import com.zubair.Restaurants.dao.UserDao;
import com.zubair.Restaurants.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ImpUserService implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public String saveUsers(List<User> users) {
        userDao.saveAll(users);
        return "User saved "+users.size();
    }

    @Override
    public List<User> getUsers() {
        return (List<User>) userDao.findAll();
    }

    @Override
    public Optional<User> getUser(Integer userId) {
        return (Optional<User>) userDao.findById(userId);
    }

}
