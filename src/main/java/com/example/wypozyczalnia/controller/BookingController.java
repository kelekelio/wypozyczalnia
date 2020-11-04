package com.example.wypozyczalnia.controller;

import com.example.wypozyczalnia.model.Branch;
import com.example.wypozyczalnia.model.Reservation;
import com.example.wypozyczalnia.service.BranchService;
import com.example.wypozyczalnia.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class BookingController {
    @Autowired
    private BranchService branchService;
    @Autowired
    private ReservationService reservationService;

    @RequestMapping(value = "/booking", method = RequestMethod.GET)
    public String getBookingPage(Model model) {
        model.addAttribute("bookingForm", new Reservation());
        List<Branch> branchList = branchService.listAll();
        model.addAttribute("branchList", branchList);
        return "booking/booking";
    }

    @PostMapping("/booking")
    public String bookingSubmit(@ModelAttribute("bookingForm") Reservation reservation) {
        reservationService.save(reservation);
        return "booking/result";
    }
//    @RequestMapping(value = {"/booking"}, method = RequestMethod.POST)
//    public RedirectView postBooking(@ModelAttribute Reservation reservation) {
//        reservationService.save(reservation);
//        return new RedirectView("booking/result");
//    }
}