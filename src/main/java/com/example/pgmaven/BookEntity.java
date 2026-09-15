package com.example.pgmaven;

import jakarta.persistence.Entity;

@Entity
public class BookEntity {
 
    Long id;
    String name;
    Integer pages;
}
