package com.example.wypozyczalnia.service;

import com.example.wypozyczalnia.model.Role;
import com.example.wypozyczalnia.model.User;
import com.example.wypozyczalnia.repository.RoleRespository;
import com.example.wypozyczalnia.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author Grzegorz Nowakowski
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRespository roleRespository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void saveUser(User user) {

        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        Role userRole = roleRespository.findByRole("USER");
        if (userRole == null) {
            roleRespository.save(new Role(1L, "USER"));
            roleRespository.save(new Role(2L, "EMPL"));
            roleRespository.save(new Role(3L, "MANAGER"));
            roleRespository.save(new Role(4L, "ADMIN"));
            userRole = roleRespository.findByRole("USER");
        }
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        userRepository.save(user);
    }

    public User findUserById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> listAll() {
        return userRepository.findAll();
    }

    @Override
    public void delete(long id) {
        userRepository.deleteById(id);
    }

}
