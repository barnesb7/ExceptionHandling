package com.company;

public class AttendeeManager {

    public Attendee createById(String idNumber){
        return new Attendee(idNumber);
    }
}
