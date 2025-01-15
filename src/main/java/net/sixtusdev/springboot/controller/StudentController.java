package net.sixtusdev.springboot.controller;

import net.sixtusdev.springboot.bean.Student;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    // HTTP GET Request
    // http://localhost:8080/students to access this method

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>(); // Create an ArrayList object
        students.add(new Student(1, "John", "Doe"));
        students.add(new Student(2, "Jane", "Doe"));
        students.add(new Student(3, "John", "Smith"));
        students.add(new Student(4, "Jane", "Smith"));

        return students;
    }

    // Spring Boot REST API with Path Variable
    // HTTP GET Request
    // http://localhost:8080/students/1/john/doe to access this method

    // {id} is called URI Template Variable
    @GetMapping("/students/{id}/{first-name}/{last-name}")
    public Student studentPathVariable(@PathVariable("id") int studentId,
            @PathVariable("first-name") String firstName,
            @PathVariable("last-name") String lastName) {
        return new Student(studentId, firstName, lastName);
    }

}
