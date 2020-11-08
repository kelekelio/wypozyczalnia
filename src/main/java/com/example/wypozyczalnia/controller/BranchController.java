package com.example.wypozyczalnia.controller;

import com.example.wypozyczalnia.model.Branch;
import com.example.wypozyczalnia.model.Car;
import com.example.wypozyczalnia.model.User;
import com.example.wypozyczalnia.service.BranchService;
import com.example.wypozyczalnia.service.CarService;
import com.example.wypozyczalnia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class BranchController {
    @Autowired
    private BranchService branchService;

    @Autowired
    private CarService carService;

    @Autowired
    private UserService userService;

    @RequestMapping("branchList")
    public String viewBranchList(Model model) {
        List<Branch> branchList = branchService.listAll();
        model.addAttribute("branchList", branchList);
        return "branch/branchList";
    }

    @RequestMapping("branch/addNewBranch")
    public String addNewBranchForm(Model model) {
        Branch branch = new Branch();
        model.addAttribute("branch", branch);
        return "branch/addNewBranch";
    }

    @RequestMapping(value = "/saveB", method = RequestMethod.POST)
    public String saveBranch(@ModelAttribute("branch") Branch branch) {
        branchService.save(branch);

        return "redirect:branchList";
    }



    @RequestMapping({"/branch/editBranch/{id}"})
    public String editExistingBranch(@PathVariable(value = "id") long id, Model model) {



        Branch branch = branchService.get(id);
        model.addAttribute("branch", branch);

        List<Car> carList = carService.listAllCarsByBranch(id);
        model.addAttribute("carList", carList);

        List<User> userList = userService.listAll();
        model.addAttribute("userList", userList);



        return "branch/editBranch";
    }


    @RequestMapping({"/branch/deleteBranch/{id}"})
    public RedirectView deleteCar(Model model, @PathVariable("id") Long id) {
        branchService.delete(id);
        return new RedirectView("/branchList");
    }

    @RequestMapping("/branch/addBranch")
    public String addBranch(Model model) {
        Branch branch = new Branch();
        model.addAttribute("branch", branch);
        return "branch/editBranch";
    }

    @RequestMapping(value = {"/branch/addBranch"}, method = RequestMethod.POST)
    public RedirectView saveNewBranch(@ModelAttribute Branch branch) {
        branchService.save(branch);
        return new RedirectView("/branchList");
    }


}
