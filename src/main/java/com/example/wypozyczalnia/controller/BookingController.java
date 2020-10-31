package com.example.wypozyczalnia.controller;

import com.example.wypozyczalnia.model.NewReservationPost;
import com.example.wypozyczalnia.model.Branch;
import com.example.wypozyczalnia.model.Car;
import com.example.wypozyczalnia.model.Reservation;
import com.example.wypozyczalnia.service.BranchService;
import com.example.wypozyczalnia.service.CarService;
import com.example.wypozyczalnia.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Controller
public class BookingController {
    @Autowired
    private CarService carService;
    @Autowired
    private BranchService branchService;
    @Autowired
    private ReservationService reservationService;

    @RequestMapping(value = "/booking")
    public String getBookingPage(Model model) {
        List<Branch> branches = branchService.listAll();
        List<Car> cars = carService.listAll();
        model.addAttribute("branchList", branches);
        model.addAttribute("carList", cars);
        model.addAttribute("bookingForm", new NewReservationPost());
        return "booking/booking";
    }

    @ResponseBody
    @RequestMapping(value = {"/booking"}, method = RequestMethod.POST)
    public long addNewBooking(@ModelAttribute NewReservationPost bookingForm, Model model) {
        Reservation reservation = map(bookingForm);
        this.reservationService.save(reservation);
        return reservation.getId();
    }

    private Reservation map(NewReservationPost model) {
        Reservation reservation = new Reservation();
        Car car = carService.get(model.getCarId());
        Branch dropOffBranch = branchService.get(model.getDropOffBranchId());
        Branch pickupBranch = null;
//        model.getPickupBranchId() == model.getDropOffBranchId()
//                ? dropOffBranch
//                : branchService.get(model.getPickupBranchId());

        reservation.setCar(car);
        reservation.setDropOffBranch(dropOffBranch);
        reservation.setPickupBranch(pickupBranch);
        reservation.setFromDate(model.getFrom());
        reservation.setToDate(model.getTo());
        reservation.setReservationDate(LocalDate.now());
        long days = ChronoUnit.DAYS.between(model.getFrom(), model.getTo());
        reservation.setPrice(car.getPrice() * days);
        return reservation;
    }
}