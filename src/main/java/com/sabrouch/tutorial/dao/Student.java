package com.sabrouch.tutorial.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by sabrouch.
 * Date: 1/22/2021
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Student")

@SequenceGenerator(name = "seq", sequenceName = "seq",allocationSize = 1)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    @Column(unique = true, updatable = false)
    private Long id;
    @Column(unique = true, columnDefinition = "Text", nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String lastname;
    @Column(columnDefinition = "Text")
    private String email;
    @Column(unique = true, updatable = false)
    private Integer age;
    public Student(String firstName,
                   String lastName,
                   String email,
                   Integer age) {
        this.name = firstName;
        this.lastname = lastName;
        this.email = email;
        this.age = age;
    }
}
