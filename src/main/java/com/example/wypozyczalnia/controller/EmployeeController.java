package com.example.wypozyczalnia.controller;

import com.example.wypozyczalnia.model.Employee;
import com.example.wypozyczalnia.repository.EmployeeRepository;
import com.example.wypozyczalnia.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    EmployeeRepository employeeRepository;
    @RequestMapping("/employeeList")
    public String viewEmployeeList(Model model) {
        List<Employee> employeeList = employeeService.listAll();
        model.addAttribute("employeeList", employeeList);
        return "employee/employeeList";
    }
    @RequestMapping("employee/addNewEmployee")
    public String addNewEmployeeForm(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee/addNewEmployee";
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.save(employee);
        return "redirect:/employeeList";
    }
    @GetMapping("showUpdateEmployeeForm/{id}")
    public RedirectView showUpdateEmployeeForm(@PathVariable(value="id") long id,Model model) {
        Employee employee = employeeService.get(id);
        model.addAttribute("employee", employee);
        return new RedirectView("employee/updateEmployee");
    }
    @GetMapping({"employee/employeeList/{id}"})
    public String deleteEmployee(Model model, @PathVariable("id") Long id) {
        employeeService.delete(id);
        return "redirect:/employeeList";
    }
}
