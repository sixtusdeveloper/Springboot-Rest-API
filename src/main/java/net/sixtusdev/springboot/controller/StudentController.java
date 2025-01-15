package net.sixtusdev.springboot.controller;

import net.sixtusdev.springboot.bean.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // This means that this class is a Controller
public class StudentController {

    // HTTP GET Request
    // http://localhost:8080/student to access this method
    @GetMapping("/student")
    public Student getStudent() {
        Student student = new Student(
                1,
                "John",
                "Doe"

        );
        return student;
    }

}
