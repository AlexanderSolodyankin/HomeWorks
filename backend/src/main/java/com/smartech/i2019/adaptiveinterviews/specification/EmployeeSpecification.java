package com.smartech.i2019.adaptiveinterviews.specification;

import com.smartech.i2019.adaptiveinterviews.model.Employee;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class EmployeeSpecification {

    public Specification<Employee> hasFirstName(String firstName) {
        return (employee, cq, cb) -> cb.equal(employee.get("firstName"), firstName);
    }

    public Specification<Employee> hasLastName(String lastName) {
        return (employee, cq, cb) -> cb.equal(employee.get("lastName"), lastName);
    }

    public Specification<Employee> hasStatus(String status) {
        return (employee, cq, cb) -> cb.equal(employee.get("status"), status);
    }
}
