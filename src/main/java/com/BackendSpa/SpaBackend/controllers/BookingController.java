package com.BackendSpa.SpaBackend.controllers;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BackendSpa.SpaBackend.models.Bookings;
import com.BackendSpa.SpaBackend.models.FieldData;
import com.BackendSpa.SpaBackend.services.BookingsService;
@CrossOrigin(origins ="http://localhost:5173")
@RestController
public class BookingController {

    private BookingsService bookingsService;
    

    public BookingController(BookingsService bookingsService) {
        this.bookingsService = bookingsService;
    }

    

    @GetMapping
    public String getRoot(){
        return "{'Hello': 'World'}";
    }
    
  
    @GetMapping("/bookings")
public ResponseEntity<List<Bookings>> getBookings() {
    List<Bookings> bookings = bookingsService.getBookings();
    if (bookings != null && !bookings.isEmpty()) {
        return ResponseEntity.ok(bookings);
    } else {
        return ResponseEntity.notFound().build();
    }
}


    
   @PostMapping("/bookings")
public ResponseEntity<List<Bookings>> addBookings(@RequestBody List<Map<String, List<Bookings>>> bookingListWrapper) {
    if (bookingListWrapper != null && !bookingListWrapper.isEmpty()) {
        List<Bookings> bookingList = new ArrayList<>();
        for (Map<String, List<Bookings>> wrapper : bookingListWrapper) {
            List<Bookings> bookings = wrapper.get("bookings");
            if (bookings != null) {
                bookingList.addAll(bookings);
            }
        }
        
        // Process each booking in the list and save it to the database
        for (Bookings booking : bookingList) {
            bookingsService.addBookings(booking);
        }
        
        // Return the list of bookings in the response
        return ResponseEntity.ok(bookingList);
    } else {
        // If the provided list is empty or null, return an error response
        return ResponseEntity.badRequest().build();
    }
}




    

}

