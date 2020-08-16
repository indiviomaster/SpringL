package com.geekbrains;

import org.springframework.stereotype.Component;

@Component("Client")
public class Client {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void ask(){
        System.out.println("Клиент "+name+" запросил карту");
    }
}
