package com.geekbrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Receiption")
public class Receiption {

    @Autowired
    private Doctor doctor;
    @Autowired
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }


    public void giveCard() {
        System.out.println("Карта выдана");
        doctor.heal();
    }

}
