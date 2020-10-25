package com.example.wypozyczalnia.service;

import com.example.wypozyczalnia.model.Employee;
import com.example.wypozyczalnia.model.Role;
import com.example.wypozyczalnia.repository.EmployeeRepository;
import com.example.wypozyczalnia.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleService {
    @Autowired
    private final RoleRepository roleRepository;

    public List<Role> listAll() {
        return roleRepository.findAll();
    }

    public void save(Role role) {
        roleRepository.save(role);
    }

    public Role get(Long id) {

        return roleRepository.findById(id).get();
    }

    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }

    public RoleService(RoleRepository roleRepository) {

        this.roleRepository = roleRepository;
    }
}
