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
    @RequestMapping("employee/updateEmployee2")
    public String updateEmployeeForm2(Model model) {
        Employee employee2 = new Employee();
        model.addAttribute("employee2", employee2);
        return "employee/updateEmployee2";
    }
    @RequestMapping("employee/updateEmployee")
    public String updateEmployeeForm(Model model) {
        Employee employeeUpdate = new Employee();
        model.addAttribute("employeeUpdate", employeeUpdate);
        return "employee/updateEmployee";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.save(employee);
        return "redirect:/employeeList";
    }
    @RequestMapping(value = "/save2", method = RequestMethod.POST)
    public String saveEmployee2(@ModelAttribute("employee") Employee employee) {
        employeeService.save(employee);
        return "redirect:/employeeList";
    }

    @RequestMapping(value = "/saveUpdate", method = RequestMethod.POST)
    public String saveUpdateEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.save(employee);
        return "redirect:/employeeList";
    }

    @RequestMapping({"/showUpdateEmployeeForm/{id}"})
    public RedirectView showUpdateEmployeeForm(@PathVariable(value = "id") long id, Model model) {
        Employee employeeUpdate = employeeService.get(id);
        model.addAttribute("employeeUpdate", employeeUpdate);
        return new RedirectView("updateEmployee");
    }

    @GetMapping({"/deleteEmployee/{id}"})
    public String deleteEmployee(@PathVariable("id") long id) {
        employeeService.deleteEmployee(id);
        return "redirect:/employeeList";
    }
}
