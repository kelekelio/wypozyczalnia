package com.example.wypozyczalnia.service;

import com.example.wypozyczalnia.model.Role;

import java.util.List;

/**
 * @author Grzegorz Nowakowski
 */
public interface RoleService {
    public void saveRole(Role role);

    public List<Role> listAll();
}
