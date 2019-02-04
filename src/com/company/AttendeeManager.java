package com.company;

public class AttendeeManager {

    public Attendee createById(String idNumber) throws InvalidIDNumberException{

            if(idNumber.length() == 8){
                return new Attendee(idNumber);
            } else {
                throw new InvalidIDNumberException("Error creating Attendee. Invalid ID number");
            }
    }
}
