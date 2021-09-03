package com.smartech.i2019.adaptiveinterviews.controller;

import com.smartech.i2019.adaptiveinterviews.api.DepartmentService;
import com.smartech.i2019.adaptiveinterviews.api.EmployeeService;
import com.smartech.i2019.adaptiveinterviews.model.Employee;
import com.smartech.i2019.adaptiveinterviews.util.EmployeeForm;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.constraints.Min;
import java.util.List;

@RequestMapping("/employees")
@RestController
@Tag(name = "Сотрудники", description = "Взаимодействие с сотрудниками")
public class EmployeeController {
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/test")
    public String hello() {
        return "Full Stack Java with Spring Boot & VueJS!";
    }

    @Operation(summary = "Показать всех сотрудников")
    @GetMapping()
    ResponseEntity<List<Employee>> allEmployees() {
        List<Employee> employees = employeeService.findAll();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @Operation(summary = "Найти сотрудника по ID")
    @GetMapping("/find/{id}")
    ResponseEntity<Employee> findEmployee(@PathVariable @Min(1) long id) throws EntityNotFoundException {
        Employee employee = employeeService.findById(id);
        if (employee == null) {
            throw new EntityNotFoundException("Сотрудник не найден");
        }
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @Operation(summary = "Добавить сотрудника")
    @PostMapping("/add")
    ResponseEntity<Employee> addEmployee(@RequestBody EmployeeForm form) {
        Employee employee = new Employee();
        employee.setFirstName(form.getFirstName());
        employee.setLastName(form.getLastName());
        employee.setDepartment(departmentService.findByName(form.getDepartment()));
        employee.setEmploymentDate(form.getEmploymentDate());
        employee.setEndOfAdaptation(form.getEndOfAdaptation());
        employee.setStatus(form.getStatus());
        employee.setPosition(form.getPosition());
        employeeService.add(employee);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @Operation(summary = "Обновить данные сотрудника")
    @PutMapping("/update/{id}")
    ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
        employeeService.edit(employee);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @Operation(summary = "Удалить сотрудника")
    @DeleteMapping("/delete/{id}")
    ResponseEntity<String> deleteEmployee(@PathVariable long id) {
        employeeService.delete(id);
        return new ResponseEntity<>("Сотрудник удален", HttpStatus.OK);
    }

}


