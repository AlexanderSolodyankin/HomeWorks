package com.smartech.i2019.adaptiveinterviews.util;

import com.smartech.i2019.adaptiveinterviews.model.Employee;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.sql.Date;

@Data
public class EmployeeForm {
    private long id;
    @NotBlank(message = "Заполните обязательное поле")
    private String firstName;
    @NotBlank(message = "Заполните обязательное поле")
    private String lastName;
    private String department;
    private Date employmentDate;
    private String date1;
    private String date2;
    private Date endOfAdaptation;
    @NotBlank(message = "Заполните обязательное поле")
    private String position;
    private String status;
    private Employee employee;

}
