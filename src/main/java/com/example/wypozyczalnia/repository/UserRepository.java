package com.example.wypozyczalnia.repository;

import com.example.wypozyczalnia.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Grzegorz Nowakowski
 */
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {



    //List<User> userListByRoleId(Integer id);

    User findByEmail(String email);

    User findById(long id);

    List<User> findByRolesId(Integer id);

    List<User> findAllByRolesRole(String role);
}
