package com.smartech.i2019.adaptiveinterviews.service;

import com.smartech.i2019.adaptiveinterviews.api.DepartmentService;
import com.smartech.i2019.adaptiveinterviews.model.Department;
import com.smartech.i2019.adaptiveinterviews.repository.DepartmentRepository;
import com.smartech.i2019.adaptiveinterviews.specification.DepartmentSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private DepartmentSpecification departmentSpecification;

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public void add(Department department) {
        departmentRepository.saveAndFlush(department);
    }

    @Override
    public void delete(long id) {
        departmentRepository.deleteById(id);
    }

    @Override
    public Department findById(long id) {
        return departmentRepository.findById(id).orElse(null);
    }

    @Override
    public Department findByName(String name) {
        return departmentRepository.findOne(departmentSpecification.hasName(name)).orElse(null);
    }

    @Override
    public void edit(Department newDepartment) {
        departmentRepository.saveAndFlush(newDepartment);
    }

}
