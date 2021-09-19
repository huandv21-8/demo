package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
}
