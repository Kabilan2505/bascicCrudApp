package com.example.crud.application.controller;

import com.example.crud.application.entity.Student;
import com.example.crud.application.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return service.getAll();
    }

    @PostMapping("/saveStudent")
    public Student CreateStudent(@RequestBody Student student){
     return service.save(student);
    }

    @GetMapping("/getbyid/{id}")
    public Student getStudentsById(@PathVariable int id){
        return service.getById(id);
    }

    @PostMapping("/updateStudents/{id}")
    public Student editStudents(@PathVariable int id, @RequestBody Student stud){

        Student student=service.getById(id);
        student.setId(id);
        student.setName(stud.getName());
        student.setAge(stud.getAge());
        student.setDepartment(stud.getDepartment());
        student.setEmailId(stud.getEmailId());
        student.setPhoneNo(stud.getPhoneNo());

        return service.edit(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public String remove(@PathVariable int id){
        service.deleteById(id);
        return "Data Deleted successfully";
    }


}
