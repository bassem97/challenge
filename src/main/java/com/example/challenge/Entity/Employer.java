package com.example.challenge.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity @Getter @Setter @NoArgsConstructor
public class Employer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("Timestamp")
    private String timestamp;
    @JsonProperty("Employer")
    private String employer;
    @JsonProperty("Location")
    private String location;
    @JsonProperty("Job Title")
    private String jobTitle;
    @JsonProperty("Years at Employer")
    private String yearsAtEmployer;
    @JsonProperty("Years of Experience")
    private String yearsOfExperience;
    @JsonProperty("Annual Base Pay")
    private String annualBasePay;
    @JsonProperty("Signing Bonus")
    private String signingBonus;
    @JsonProperty("Annual Bonus")
    private String annualBonus;
    @JsonProperty("Annual Stock Value/Bonus")
    private String annualStockValueBonus;
    @JsonProperty("Gender")
    private String gender;
    @JsonProperty("Additional Comments")
    @Column(length = 3000)
    private String additionalComments;

    public Employer(String timestamp, String employer, String location, String jobTitle, String yearsAtEmployer, String yearsOfExperience, String annualBasePay, String signingBonus, String annualBonus, String annualStockValueBonus, String gender, String additionalComments) {
        this.timestamp = timestamp;
        this.employer = employer;
        this.location = location;
        this.jobTitle = jobTitle;
        this.yearsAtEmployer = yearsAtEmployer;
        this.yearsOfExperience = yearsOfExperience;
        this.annualBasePay = annualBasePay;
        this.signingBonus = signingBonus;
        this.annualBonus = annualBonus;
        this.annualStockValueBonus = annualStockValueBonus;
        this.gender = gender;
        this.additionalComments = additionalComments;
    }


}
