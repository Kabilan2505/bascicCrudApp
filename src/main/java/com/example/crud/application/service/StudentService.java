package com.example.crud.application.service;

import com.example.crud.application.entity.Student;
import com.example.crud.application.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
   public StudentRepository repo;

    public List<Student> getAll(){
       return repo.findAll();
    }

    public Student getById(int id){
      return repo.findById(id).get();
    }

    public Student save(Student student){
       return repo.save(student);

    }

    public Student edit(Student student){
        return repo.save(student);
    }

    public void deleteById(int id){
        repo.deleteById(id);
    }


}
