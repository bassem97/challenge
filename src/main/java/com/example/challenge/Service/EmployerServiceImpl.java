package com.example.challenge.Service;
import com.example.challenge.Entity.Employer;
import com.example.challenge.Repository.EmployerRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service
public class EmployerServiceImpl implements EmployerService{

    @Autowired
    private EmployerRepository employerRepository;

    @Override
    public List<Employer> findAll() {
        return  employerRepository.findAll();
    }

    @Override
    public void save(List<Employer> employers) {
        employers.forEach(employer -> employerRepository.save(employer));
    }


}
