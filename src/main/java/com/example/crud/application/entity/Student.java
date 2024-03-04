package com.example.crud.application.entity;

import jakarta.persistence.*;

@Entity
@Table(name= "Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column( name="Student Name")
    private String name;
    @Column( name="EmailId")
    private String emailId;
    @Column(name ="Phone Number")
    private String phoneNo;

    @Column(name ="Department")
    private String department;

    @Column(name = "Age")
    private String age;

    public Student(int id, String name, String emailId, String phoneNo, String department, String age) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.phoneNo = phoneNo;
        this.department = department;
        this.age = age;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
