package com.example.wypozyczalnia.service;

import com.example.wypozyczalnia.model.Role;
import com.example.wypozyczalnia.repository.RoleRespository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Grzegorz Nowakowski
 */
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRespository roleRespository;

    @Override
    public void saveRole(Role role) {
        roleRespository.save(role);
    }
}
