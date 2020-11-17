package com.example.wypozyczalnia.controller;

import com.example.wypozyczalnia.model.Branch;
import com.example.wypozyczalnia.model.Car;
import com.example.wypozyczalnia.service.BranchService;
import com.example.wypozyczalnia.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

/**
 * @author Grzegorz Nowakowski
 */
@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @Autowired
    private BranchService branchService;

    @RequestMapping("/carList")
    public String viewCarList(Model model, Authentication auth) {

        List<Car> carList = carService.listAll();
        model.addAttribute("carList", carList);

        List<Branch> branchList = branchService.listAll();
        model.addAttribute("branchList", branchList);


        return "car/carList";
    }

    @RequestMapping("/car/addCar")
    public String addNewCar(Model model) {
        Car car = new Car();
        model.addAttribute("car", car);

        List<Branch> branchList = branchService.listAll();
        model.addAttribute("branchList", branchList);

        return "car/addCar";
    }

    @RequestMapping(value = {"/car/addCar"}, method = RequestMethod.POST)
    public RedirectView saveNewCar(@ModelAttribute Car car) {
        carService.save(car);
        return new RedirectView("/carList");
    }

    @RequestMapping({"/car/addCar/{id}"})
    public String updateCar(@PathVariable(value = "id") long id, Model model) {
        Car car = carService.get(id);
        model.addAttribute("car", car);

        List<Branch> branchList = branchService.listAll();
        model.addAttribute("branchList", branchList);
        return "car/addCar";
    }


    @RequestMapping({"/car/deleteCar/{id}"})
    public RedirectView deleteCar(Model model, @PathVariable("id") Long id) {
        carService.deleteById(id);
        return new RedirectView("/carList");
    }
}
