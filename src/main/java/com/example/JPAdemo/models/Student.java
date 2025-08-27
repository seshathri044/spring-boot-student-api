package com.example.JPAdemo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Student {
    @Id
    private int rno;
    private String name;
    private String gender;
    private String technology;

    public Student(){

    }
}

