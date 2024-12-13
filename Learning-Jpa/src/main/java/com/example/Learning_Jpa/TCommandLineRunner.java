package com.example.Learning_Jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TCommandLineRunner implements CommandLineRunner {

    @Autowired
    private JpaRepository jpaRepository;

    @Override
    public void run(String... args) throws Exception {
        jpaRepository.insert(new Course(1, "Python", "Shreekant"));
        jpaRepository.insert(new Course(2, "Java", "Suhas"));
        jpaRepository.insert(new Course(3, "Kotlin", "Pukale"));

        jpaRepository.delete(2);
        System.out.println(jpaRepository.find(3).name);
    }
}
