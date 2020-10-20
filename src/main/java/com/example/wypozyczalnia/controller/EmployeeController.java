package com.example.wypozyczalnia.controller;

import com.example.wypozyczalnia.model.Employee;
import com.example.wypozyczalnia.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/employeeList")
    public String viewEmployeeList(Model model) {
        List<Employee> employeeList = employeeService.listAll();
        model.addAttribute("employeeList", employeeList);
        return "employeeList";

    }
}
