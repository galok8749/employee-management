package com.alok.employeemanagement.repository;

import com.alok.employeemanagement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
