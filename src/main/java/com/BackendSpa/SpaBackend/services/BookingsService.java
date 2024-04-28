package com.BackendSpa.SpaBackend.services;

import java.util.Collection;
import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import com.BackendSpa.SpaBackend.models.Bookings;

@Service
public class BookingsService {

    private final MongoOperations mongoOperations;
    

    public BookingsService(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }


    public List<Bookings> getBookings() {
        return mongoOperations.findAll(Bookings.class);
        
    }

    public Bookings addBookings(Bookings bookings){
        return mongoOperations.insert(bookings);
    }
    
}
