package com.example.wypozyczalnia.service;

import com.example.wypozyczalnia.model.User;

/**
 * @author Grzegorz Nowakowski
 */
public interface UserService {

    public User findUserByEmail(String email);

    public void saveUser(User user);

}
