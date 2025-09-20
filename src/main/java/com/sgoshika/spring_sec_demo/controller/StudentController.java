package com.sgoshika.spring_sec_demo.controller;


import com.sgoshika.spring_sec_demo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> studentList=new ArrayList<Student>(
            List.of(new Student(1,"Sandeep","Java"),
            new Student(2,"Eric","JS"),
            new Student(3, "Adam","REACT")));

    @GetMapping("getstudents")
    public List<Student> getStudents(){
        return studentList;
    }

    @PostMapping("addstudent")
    public void addStudent(@RequestBody Student student){
        studentList.add(student);
    }



}
