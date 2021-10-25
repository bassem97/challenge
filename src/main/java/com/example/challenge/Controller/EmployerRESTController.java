package com.example.challenge.Controller;

import com.example.challenge.Entity.Employer;
import com.example.challenge.Service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employer/")
public class EmployerRESTController {

    @Autowired
    private EmployerService employerService;

    @GetMapping("/list")
    public List<Employer> findAll() {
        return employerService.findAll();
    }


}
