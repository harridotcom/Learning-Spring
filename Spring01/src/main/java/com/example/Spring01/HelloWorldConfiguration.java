package com.example.Spring01;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Address(String add, String name) {}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Shreekant";
    }

    @Bean
    @Qualifier("pushpak")
    public String name2(){
        return "Suhas";
    }

    @Bean
    @Primary
    public Address address(){
        return new Address("shree complex, sect-14, plot no. 123", name());
    }

    @Bean(name = "address1")
    public Address address1(@Qualifier("pushpak") String name){
        return new Address("Pushpak Nagar", name);
    }

}
