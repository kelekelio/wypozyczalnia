package com.example.wypozyczalnia.service;

import com.example.wypozyczalnia.model.Car;
import com.example.wypozyczalnia.model.User;

import java.util.List;

/**
 * @author Grzegorz Nowakowski
 */
public interface UserService {

    public User findUserByEmail(String email);

    public User findUserById(long id);

    public void saveUser(User user);

    public void updateUser(User user);

    public List<User> listAll();

    public void delete(long id);

}
