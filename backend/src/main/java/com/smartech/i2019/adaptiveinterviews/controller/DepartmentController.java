package com.smartech.i2019.adaptiveinterviews.controller;

import com.smartech.i2019.adaptiveinterviews.api.DepartmentService;
import com.smartech.i2019.adaptiveinterviews.model.Department;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@RestController
@Tag(name = "Отделы", description = "Взаимодействие с отделами")
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @Operation(summary = "Список всех отделов")
    @GetMapping()
    ResponseEntity<List<Department>> findAll() {
        List<Department> departments = departmentService.findAll();
        return new ResponseEntity<>(departments, HttpStatus.OK);
    }

    @Operation(summary = "Добавить отдел")
    @PostMapping("/add")
    ResponseEntity<Department> addDepartment(@Valid @RequestBody Department department) {
        departmentService.add(department);
        return new ResponseEntity<>(department, HttpStatus.OK);
    }

    @Operation(summary = "Удалить отдел")
    @DeleteMapping("/delete/{id}")
    @Secured("ROLE_ADMIN")
    ResponseEntity<String> deleteDepartment(@PathVariable long id) {
        departmentService.delete(id);
        return new ResponseEntity<>("Department deleted", HttpStatus.OK);
    }

    @Operation(summary = "Найти отдел по ID")
    @GetMapping("/find/{id}")
    ResponseEntity<Department> findDepartment(@PathVariable @Min(1) long id) {
        Department department = departmentService.findById(id);
        if (department == null) {
            throw new EntityNotFoundException("Отдел не найден");
        }
        return new ResponseEntity<>(department, HttpStatus.OK);
    }

    @Operation(summary = "Обновить данные отдела")
    @PutMapping("/update/{id}")
    ResponseEntity<Department> updateDepartment(@RequestBody Department department) {
        departmentService.edit(department);
        return new ResponseEntity<>(department, HttpStatus.OK);
    }

}
