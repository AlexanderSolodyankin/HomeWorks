package com.smartech.i2019.adaptiveinterviews.api;

import com.smartech.i2019.adaptiveinterviews.model.Employee;
import com.smartech.i2019.adaptiveinterviews.model.Interview;
import com.smartech.i2019.adaptiveinterviews.model.UploadFile;

import java.util.List;
import java.util.Set;

public interface EmployeeService {
    void add(Employee employee);

    void edit(Employee employee);

    void delete(long id);

    List<Employee> findAll();

    Employee findById(long id);

    Employee findByName(String firstName, String lastName);

    Employee findByLastName(String lastName);

    List<Employee> listByStatus(String name);

    List<Employee> listByLastName(String lastName);

    Set<Interview> getInterviews(long id);

    Set<UploadFile> getUploadFiles(long id);
}
