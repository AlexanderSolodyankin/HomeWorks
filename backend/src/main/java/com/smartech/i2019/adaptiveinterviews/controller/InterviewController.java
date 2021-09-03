package com.smartech.i2019.adaptiveinterviews.controller;

import com.smartech.i2019.adaptiveinterviews.api.EmployeeService;
import com.smartech.i2019.adaptiveinterviews.api.InterviewService;
import com.smartech.i2019.adaptiveinterviews.api.UserService;
import com.smartech.i2019.adaptiveinterviews.model.Employee;
import com.smartech.i2019.adaptiveinterviews.model.Interview;
import com.smartech.i2019.adaptiveinterviews.util.InterviewForm;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.constraints.Min;
import java.util.List;

@RestController
@RequestMapping("/interviews")
@Tag(name = "Беседы", description = "Взаимодействие с беседами")
public class InterviewController {
    @Autowired
    private InterviewService interviewService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private UserService userService;

    @Operation(summary = "Список всех бесед")
    @GetMapping()
    ResponseEntity<List<Interview>> list() {
        List<Interview> interviews = interviewService.findAll();
        return new ResponseEntity<>(interviews, HttpStatus.OK);
    }

    @Operation(summary = "Найти беседу по ID")
    @GetMapping("/find/{id}")
    ResponseEntity<Interview> findInterview(@PathVariable @Min(1) Long id) throws EntityNotFoundException {
        Interview interview = interviewService.findById(id);
        if (interview == null) {
            throw new EntityNotFoundException("Беседа не найдена");
        }
        return new ResponseEntity<>(interview, HttpStatus.OK);
    }

    @Operation(summary = "Добавить беседу")
    @PostMapping("/add")
    ResponseEntity<Employee> addInterview(@RequestBody InterviewForm form) {
        Employee employee = employeeService.findByName(form.getFirstName(), form.getLastName());
        Interview interview = new Interview();
        interview.setDescription(form.getDescription());
        interview.setDate(form.getDate());
        interview.setUser(userService.findByName(form.getNameOfUser()));
        interview.setEmployee(employee);
        interview.setName(form.getName());
        interviewService.add(interview);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @Operation(summary = "Удалить беседу")
    @DeleteMapping("/delete/{id}")
    ResponseEntity<String> deleteInterview(@PathVariable Long id) {
        interviewService.delete(id);
        return new ResponseEntity<>("Беседа удалена", HttpStatus.OK);
    }

    @Operation(summary = "Обновить данные беседы")
    @PutMapping("/update/{id}")
    ResponseEntity<Interview> updateInterview(@RequestBody Interview interview) {
        interviewService.edit(interview);
        return new ResponseEntity<>(interview, HttpStatus.OK);
    }

}
