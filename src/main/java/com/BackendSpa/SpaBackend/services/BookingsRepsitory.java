package com.BackendSpa.SpaBackend.services;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.BackendSpa.SpaBackend.models.Bookings;

public interface BookingsRepsitory extends MongoRepository<Bookings, String> {
    
}
