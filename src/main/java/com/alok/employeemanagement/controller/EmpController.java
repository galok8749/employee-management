package com.alok.employeemanagement.controller;

import com.alok.employeemanagement.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmpController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/addemp")
    public String addEmpForm() {
        return "addEmp";
    }

    @PostMapping("/register")
    public String empRegister(@ModelAttribute Employee e) {
        System.out.println(e);
        return "addEmp";
    }
}
