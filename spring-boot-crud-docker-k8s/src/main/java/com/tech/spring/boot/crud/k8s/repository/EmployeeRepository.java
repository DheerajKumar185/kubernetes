package com.tech.spring.boot.crud.k8s.repository;

import com.tech.spring.boot.crud.k8s.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
