package com.smartech.i2019.adaptiveinterviews.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "supervisor")
    @NotBlank(message = "Укажите начальника отдела")
    private String supervisor;
    @Column(name = "name")
    @NotBlank(message = "Укажите название отдела")
    private String name;
    @com.fasterxml.jackson.annotation.JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "department", orphanRemoval = true)
    private Set<Employee> employeeSet = new HashSet<>();

}
