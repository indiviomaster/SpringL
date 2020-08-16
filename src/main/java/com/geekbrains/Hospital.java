package com.geekbrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Hospital
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Client client = context.getBean("Client",Client.class );
        client.setName("Vladimir");
        client.ask();
        Receiption receiption = context.getBean("Receiption",Receiption.class );
        Doctor doctor = context.getBean("Doctor",Doctor.class );
        receiption.giveCard();
    }
}
