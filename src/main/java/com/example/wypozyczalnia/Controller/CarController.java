package com.example.wypozyczalnia.Controller;

import com.example.wypozyczalnia.model.Car;
import com.example.wypozyczalnia.model.Employee;
import com.example.wypozyczalnia.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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


}
