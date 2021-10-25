package com.example.challenge;

import com.example.challenge.Entity.Employer;
import com.example.challenge.Service.EmployerService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class ChallengeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChallengeApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(EmployerService employerService) {
       return args -> {
            // read json and write to db
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<List<Employer>> typeReference = new TypeReference<List<Employer>>(){};

            InputStream inputStream = TypeReference.class.getResourceAsStream("/json/survey_3.json");
            try {
                List<Employer> employers = mapper.readValue(inputStream,typeReference);
                employerService.save(employers);
                System.out.println("Employers Saved!");
            } catch (IOException e){
                System.out.println("Unable to save employers: " + e.getMessage());
            }
        };
    }

}
