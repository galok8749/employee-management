package com.alok.employeemanagement.service;

import com.alok.employeemanagement.entity.Employee;
import com.alok.employeemanagement.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
    @Autowired
    private EmpRepository empRepository;
    public void addEmp(Employee e) {
        empRepository.save(e);
    }
}
