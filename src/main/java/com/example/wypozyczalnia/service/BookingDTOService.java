package com.example.wypozyczalnia.service;

//import com.example.wypozyczalnia.DTO.BookingDTO;
//import com.example.wypozyczalnia.model.Branch;
//import com.example.wypozyczalnia.repository.BookingDTORepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class BookingDTOService {
//    @Autowired
//    private final BookingDTORepository bookingDTORepository;
//
//    public BookingDTOService(BookingDTORepository bookingDTORepository) {
//        this.bookingDTORepository = bookingDTORepository;
//    }
//    public List<BookingDTO> listAll() {
//        return bookingDTORepository.findAll();
//    }
//
//    public void save(BookingDTO bookingDTO) {
//        bookingDTORepository.save(bookingDTO);
//    }
//
//    public BookingDTO get(Long id) {
//
//        return bookingDTORepository.findById(id).get();
//    }
//
//    public void delete(Long id) {
//        bookingDTORepository.deleteById(id);
//    }
//}
