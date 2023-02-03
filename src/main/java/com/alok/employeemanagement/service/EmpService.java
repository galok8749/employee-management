package com.alok.employeemanagement.service;

import com.alok.employeemanagement.entity.Employee;
import com.alok.employeemanagement.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {
    @Autowired
    private EmpRepository empRepository;
    public void addEmp(Employee e) {
        empRepository.save(e);
    }

    public List<Employee> getAllEmp() {
        return empRepository.findAll();
    }

    public Employee getEMpById(int id) {
        Optional<Employee> e = empRepository.findById(id);
        if (e.isPresent()) {
            return e.get();
        }
        return null;
    }

    public void deleteEMp(int id) {
        empRepository.deleteById(id);
    }

    public Page<Employee> getEMpByPaginate(int currentPage, int size) {
        Pageable p = PageRequest.of(currentPage, size);
        return empRepository.findAll(p);
    }
}
