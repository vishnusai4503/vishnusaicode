package com.sakethcode.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.AUGUST;
import static java.time.Month.OCTOBER;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {

                   Student saketh= new Student(
                            "saketh",
                            "saketh@gmail.com",

                            LocalDate.of(2001, AUGUST,9));
          Student Navya=  new Student(
                    "Navya",
                    "Navya@gmail.com",

                    LocalDate.of(2000, OCTOBER,9));
            repository.saveAll(List.of(saketh,Navya));

        };
    };
}
