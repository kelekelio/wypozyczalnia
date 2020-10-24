package com.example.wypozyczalnia.controller;

import com.example.wypozyczalnia.model.Branch;
import com.example.wypozyczalnia.model.Car;
import com.example.wypozyczalnia.model.Employee;
import com.example.wypozyczalnia.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author Grzegorz Nowakowski
 */
@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping("/carList")
    public String viewCarList(Model model) {
        List<Car> carList = carService.listAll();
        model.addAttribute("carList", carList);
        return "car/carList";
    }
    @RequestMapping("car/addNewCar")
    public String addNewCarForm(Model model) {
        Car car = new Car();
        model.addAttribute("car", car);
        return "car/addNewCar";
    }
    @RequestMapping(value = "/saveCar", method = RequestMethod.POST)
    public String saveCar(@ModelAttribute("car") Car car) {
        carService.save(car);
        return "car/carList";
    }



}
