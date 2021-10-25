package com.example.challenge.Service;

import com.example.challenge.Entity.Employer;

import java.util.List;

public interface EmployerService {
    List<Employer> findAll();
    void save(List<Employer> employers);


}
