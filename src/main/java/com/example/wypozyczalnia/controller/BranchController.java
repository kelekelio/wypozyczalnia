package com.example.wypozyczalnia.controller;

import com.example.wypozyczalnia.model.Branch;
import com.example.wypozyczalnia.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class BranchController {
    @Autowired
    private BranchService branchService;

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
}
