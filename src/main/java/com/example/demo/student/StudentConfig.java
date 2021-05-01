package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {

            Student ekaterina = new Student(
                    "Ekaterina",
                    "ekaterina@sdfs.sdf",
                    LocalDate.of(2000, Month.APRIL, 1)
            );

            Student alen = new Student(
                    "Alen",
                    "alen@sdfs.sdf",
                    LocalDate.of(2001, Month.MARCH, 3)
            );

            repository.saveAll(List.of(ekaterina, alen));

        };
    }
}
