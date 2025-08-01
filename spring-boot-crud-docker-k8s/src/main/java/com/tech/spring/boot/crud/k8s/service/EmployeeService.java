package com.tech.spring.boot.crud.k8s.service;

import com.tech.spring.boot.crud.k8s.constant.Constants;
import com.tech.spring.boot.crud.k8s.entity.Employee;
import com.tech.spring.boot.crud.k8s.exception.RecordNotFoundException;
import com.tech.spring.boot.crud.k8s.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }

    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }

    public Employee findById(int id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException(String.format(Constants.EMPLOYEE_MESSAGE, id)));
    }

    public Employee updateEmployee(Employee employee, int id) {
        Employee updatedRecord = employeeRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException(String.format(Constants.EMPLOYEE_MESSAGE, id)));
        updatedRecord.setName(employee.getName());
        updatedRecord.setSalary(employee.getSalary());
        updatedRecord.setDepartment(employee.getDepartment());
        return employeeRepository.save(updatedRecord);
    }

    public String removeEmployee(int id) {
        Employee deletedRecord = employeeRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException(String.format(Constants.EMPLOYEE_MESSAGE, id)));
        employeeRepository.delete(deletedRecord);
        return "deleted";
    }
}
