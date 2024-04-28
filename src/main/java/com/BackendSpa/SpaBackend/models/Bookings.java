package com.BackendSpa.SpaBackend.models;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bookings")
public class Bookings {
@Id
private String id;
private List<FieldData> bookingState;

public Bookings(String id, List<FieldData> bookingState) {
    this.id = id;
    this.bookingState = bookingState;
}

public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

public List<FieldData> getBookingState() {
    return bookingState;
}

public void setBookingState(List<FieldData> bookingState) {
    this.bookingState = bookingState;
}





    
}
