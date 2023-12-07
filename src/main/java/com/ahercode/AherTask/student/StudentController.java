package com.ahercode.AherTask.student;

import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentController {


    @GetMapping
    public List<Student> sayHello(){
        return List.of(new Student(
                1L,
                "Ahercode",
                "ahercode@gmail.com",
                LocalDate.of(1999, Month.JULY, 27),
                26
        ));
    }
}
