package com.smartech.i2019.adaptiveinterviews.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "firstname", nullable = false)
    private String firstName;
    @Column(name = "lastname", nullable = false)
    private String lastName;
    @ManyToOne
    @JoinColumn(name = "department")
    private Department department;
    @Column(name = "employment_date", nullable = false)
    private Date employmentDate;
    @Column(name = "end_of_adaptation")
    private Date endOfAdaptation;
    @Column(name = "position", nullable = false)
    private String position;
    @Column(name = "status")
    private String status;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "employee", orphanRemoval = true)
    private Set<UploadFile> files = new HashSet<>();
    @com.fasterxml.jackson.annotation.JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "employee", orphanRemoval = true)
    private Set<Interview> interviews = new HashSet<>();

}

