package com.example.wypozyczalnia.controller;

import com.example.wypozyczalnia.model.Employee;
import com.example.wypozyczalnia.model.User;
import com.example.wypozyczalnia.repository.EmployeeRepository;
import com.example.wypozyczalnia.service.EmployeeService;
import com.example.wypozyczalnia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private UserService userService;

    @RequestMapping("/employeeList")
    public String viewEmployeeList(Model model) {
        List<User> userList = userService.listAllByRolesRole("EMPL");
        model.addAttribute("userList", userList);
        return "employee/employeeList";
    }
}
