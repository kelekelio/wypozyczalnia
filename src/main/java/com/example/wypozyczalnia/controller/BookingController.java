package com.example.wypozyczalnia.controller;

import com.example.wypozyczalnia.DTO.BookingDTO;
import com.example.wypozyczalnia.model.Branch;
import com.example.wypozyczalnia.model.Reservation;
import com.example.wypozyczalnia.service.BranchService;
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

    @RequestMapping(value = "/booking", method = RequestMethod.GET)
    public String getBookingPage(Model model) {
        List<Branch> branchList = branchService.listAll();
        model.addAttribute("branchList", branchList);
        model.addAttribute("bookingForm", new Reservation());
        model.addAttribute("bookingDTO", new BookingDTO());

        return "booking/booking";
    }
//@RequestMapping(value = "/booking", method = RequestMethod.POST)
//public String formSubmit(@RequestParam String town, @RequestParam LocalDateTime fromDate, @RequestParam LocalDateTime toDate, Model model) {
//        model.addAttribute("town", town);
//        model.addAttribute("fromDate", fromDate);
//        model.addAttribute("toDate", toDate);
//        return "booking/result";
//}

//    @RequestMapping(value = "/booking", method = RequestMethod.POST)
//    public String bookingSubmit(@RequestParam String town, @RequestParam LocalDateTime fromDate, @RequestParam LocalDateTime toDate, Model model) {
//        model.addAttribute("town", town);
//        model.addAttribute("fromDate", fromDate);
//        model.addAttribute("toDate", toDate);
//        return "booking/result";
//    }

//    @PostMapping(value = "/booking")
//    public String bookingSubmit(@RequestParam String town, @RequestParam LocalDateTime fromDate, @RequestParam LocalDateTime toDate, Model model) {
//        model.addAttribute("town", town);
//        model.addAttribute("fromDate", fromDate);
//        model.addAttribute("toDate", toDate);
//        return "booking/result";
//    }
    @PostMapping(value = "/booking")
    public String bookingSubmit(BookingDTO bookingDTO, Model model) {
        model.addAttribute("bookingDTO", bookingDTO);
        return "booking/result";
    }
//    @RequestMapping(value = {"/booking"}, method = RequestMethod.POST)
//    public RedirectView postBooking(@ModelAttribute Reservation reservation) {
//        reservationService.save(reservation);
//        return new RedirectView("booking/result");
//    }
}