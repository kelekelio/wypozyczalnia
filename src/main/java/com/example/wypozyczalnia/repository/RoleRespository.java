package com.example.wypozyczalnia.repository;

import com.example.wypozyczalnia.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Grzegorz Nowakowski
 */
@Repository("roleRepository")
public interface RoleRespository extends JpaRepository<Role, Integer> {

    Role findByRole(String role);

}
