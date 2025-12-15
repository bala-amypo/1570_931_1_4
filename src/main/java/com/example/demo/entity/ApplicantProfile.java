package com.example.demo.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ApplicantProfile {
    private long id;
    private User user;
    private String fullName;
    private LocalDate dateOfBirth;
    private String employmentType;
    private BigDecimal monthlyIncome;
    private BigDecimal existingEmiObligations;
    private int creditScore;
    private int internalRiskScore;
    private String country;
    private boolean active;

    public ApplicantProfile() {}

    public ApplicantProfile(User user, String fullName, LocalDate dateOfBirth, String employmentType, BigDecimal monthlyIncome, BigDecimal existingEmiObligations, int creditScore, int internalRiskScore, String country, boolean active) {
        this.user = user;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.employmentType = employmentType;
        this.monthlyIncome = monthlyIncome;
        this.existingEmiObligations = existingEmiObligations;
        this.creditScore = creditScore;
        this.internalRiskScore = internalRiskScore;
        this.country = country;
        this.active = active;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public void setMonthlyIncome(BigDecimal monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public void setExistingEmiObligations(BigDecimal existingEmiObligations) {
        this.existingEmiObligations = existingEmiObligations;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public void setInternalRiskScore(int internalRiskScore) {
        this.internalRiskScore = internalRiskScore;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public BigDecimal getMonthlyIncome() {
        return monthlyIncome;
    }

    public BigDecimal getExistingEmiObligations() {
        return existingEmiObligations;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public int getInternalRiskScore() {
        return internalRiskScore;
    }

    public String getCountry() {
        return country;
    }

    public boolean isActive() {
        return active;
    }

    
}
