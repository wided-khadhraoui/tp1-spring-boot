package com.springboot.app;
/*
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StudentController {
    // http://localhost:8080/student
    @GetMapping("/student")
    public Student getStudent() {
        return new Student("Wided", "khadhraoui");
    }
}*/

/*
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StudentController {
    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("wided", "khadhraoui"));
        students.add(new Student("nidhal", "belhaj"));
        students.add(new Student("arbia", "khedhri"));
        students.add(new Student("aymen", "khadhraoui"));
        students.add(new Student("samira", "Fadatare"));
        return students;
    }
}*/

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StudentController {
    // http://localhost:8080/student/1
// @PathVariable annotation
    @GetMapping("/student/{firstName}/{lastName}/")
    public Student studentPathVariable(@PathVariable("firstName") String
                                               firstName,
                                       @PathVariable("lastName") String lastName) {
        return new Student(firstName, lastName);
    }
}


