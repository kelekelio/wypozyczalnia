package com.example.wypozyczalnia.controller;

import com.example.wypozyczalnia.DTO.BookingDTO;
import com.example.wypozyczalnia.DTO.CarDto;
import com.example.wypozyczalnia.mappers.CarMapper;
import com.example.wypozyczalnia.model.Branch;
import com.example.wypozyczalnia.model.Reservation;
import com.example.wypozyczalnia.service.BranchService;
import com.example.wypozyczalnia.service.CarService;
import com.example.wypozyczalnia.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Controller
public class BookingController {
    @Autowired
    private BranchService branchService;
    @Autowired
    private ReservationService reservationService;

    @Autowired
    private CarService carService;

    @RequestMapping(value = "/booking", method = RequestMethod.GET)
    public String getBookingPage(Model model) {
        List<Branch> branchList = branchService.listAll();
        model.addAttribute("branchList", branchList);
        model.addAttribute("bookingForm", new Reservation());
        model.addAttribute("bookingDTO", new BookingDTO());

        return "booking/booking";
    }

    @PostMapping(value = "/booking")
    public String bookingSubmit(BookingDTO bookingDTO, CarDto carDto, Model model) throws NumberFormatException {
        model.addAttribute("bookingDTO", bookingDTO);
        model.addAttribute("carsList", carService.findAllCarForBranch(bookingDTO.getTown()));
        model.addAttribute("carDto", carDto);
        return "booking/bookingCar";
    }

    @PostMapping(value = "bookingCar")
    public String bookingConfirmation(BookingDTO bookingDTO, CarDto carDto, Model model) throws NumberFormatException {
        model.addAttribute("bookingDTO", bookingDTO);
        if(bookingDTO.getSelectedCarId() != null) {
            CarDto selectedCar = CarMapper.INSTANCE
                    .carToDto(carService.get(bookingDTO.getSelectedCarId()));
            model.addAttribute("carDto", selectedCar);
        } else{
            model.addAttribute("carDto", carDto);
        }
        return "booking/bookingConfirmation";
    }
}