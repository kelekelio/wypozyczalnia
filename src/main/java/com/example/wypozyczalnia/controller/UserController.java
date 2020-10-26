package com.example.wypozyczalnia.controller;

import com.example.wypozyczalnia.model.Branch;
import com.example.wypozyczalnia.model.Car;
import com.example.wypozyczalnia.model.Role;
import com.example.wypozyczalnia.model.User;
import com.example.wypozyczalnia.repository.RoleRespository;
import com.example.wypozyczalnia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;
import java.security.Principal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Grzegorz Nowakowski
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value= {"/login"}, method= RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView model = new ModelAndView();

        model.setViewName("user/login");
        return model;
    }

    @RequestMapping(value= {"/register"}, method=RequestMethod.GET)
    public ModelAndView register() {
        ModelAndView model = new ModelAndView();
        User user = new User();
        model.addObject("user", user);
        model.setViewName("user/register");

        return model;
    }

    @RequestMapping(value= {"/register"}, method=RequestMethod.POST)
    public ModelAndView createUser(@Valid User user, BindingResult bindingResult) {
        ModelAndView model = new ModelAndView();
        User userExists = userService.findUserByEmail(user.getEmail());

        if(userExists != null) {
            bindingResult.rejectValue("email", "error.user", "This email already exists!");
        }
        if(bindingResult.hasErrors()) {
            model.setViewName("user/register");
        } else {
            userService.saveUser(user);
            model.addObject("msg", "User has been registered successfully!");
            model.addObject("user", new User());
            model.setViewName("user/register");
        }

        return model;
    }

    @RequestMapping({"/profile/{id}"})
    public String updateProfile(@PathVariable(value = "id") long id, Model model) {

        User user = userService.findUserById(id);
        model.addAttribute("user", user);

        return "user/profile";
    }


    @RequestMapping({"/profile"})
    public String userProfile(Model model, @AuthenticationPrincipal User userDetails) {



        User userA = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        long userid = userA.getId();

        User user = userService.findUserById(userid);
        model.addAttribute("user", user);

        return "user/profile";
    }


    @RequestMapping("/userList")
    public String viewUserList(Model model) {

        List<User> userList = userService.listAll();
        model.addAttribute("userList", userList);

        return "user/userList";
    }

    @RequestMapping({"/deleteUser/{id}"})
    public RedirectView deleteUser(Model model, @PathVariable("id") Long id) {
        userService.delete(id);
        return new RedirectView("/userList");
    }

    @RequestMapping(value = {"/updateUser"}, method = RequestMethod.POST)
    public RedirectView saveUpdateUser(@ModelAttribute User user) {
        userService.saveUser(user);
        return new RedirectView("/profile/" + user.getId());
    }





}
