package com.company;

public class AttendeeDemo {

    public static void main(String[] args) {

        AttendeeManager manager = new AttendeeManager();

        try{
            manager.createById("66554");
        } catch(InvalidIDNumberException ex){
            ex.printStackTrace();
        }


    }
}
