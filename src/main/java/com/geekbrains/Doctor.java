package com.geekbrains;

import org.springframework.stereotype.Component;

@Component("Doctor")
public class Doctor {

    public void heal(){
        System.out.println("Доктор вылечил");
    }
}
