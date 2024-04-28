package com.BackendSpa.SpaBackend.models;

import java.util.Date;

public class FieldData {

private int idField;
private String name;
private boolean isBooked;
private Date chosenDate;


public FieldData(int idField, String name, boolean isBooked, Date chosenDate) {
    this.idField = idField;
    this.name = name;
    this.isBooked = isBooked;
    this.chosenDate = chosenDate;
}


public int getIdField() {
    return idField;
}


public void setIdField(int idField) {
    this.idField = idField;
}


public String getName() {
    return name;
}


public void setName(String name) {
    this.name = name;
}


public boolean isBooked() {
    return isBooked;
}


public void setBooked(boolean isBooked) {
    this.isBooked = isBooked;
}


public Date getChosenDate() {
    return chosenDate;
}


public void setChosenDate(Date chosenDate) {
    this.chosenDate = chosenDate;
}


    
}
