package com.example.demo.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class LoanApplication {
    private long id;
    private ApplicantProfile applicant;
    private LoanProduct loanProduct;
    private LocalDate applicationDate;
    private BigDecimal requestedAmount;
    private int requestedTenureMonths;
    private String status;
    private BigDecimal calculatedEmiAmount;
    private String notes;

    public LoanApplication() {}

    public LoanApplication(ApplicantProfile applicant, LoanProduct loanProduct, LocalDate applicationDate, BigDecimal requestedAmount, int requestedTenureMonths, String status, BigDecimal calculatedEmiAmount, String notes) {
        this.applicant = applicant;
        this.loanProduct = loanProduct;
        this.applicationDate = applicationDate;
        this.requestedAmount = requestedAmount;
        this.requestedTenureMonths = requestedTenureMonths;
        this.status = status;
        this.calculatedEmiAmount = calculatedEmiAmount;
        this.notes = notes;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setApplicant(ApplicantProfile applicant) {
        this.applicant = applicant;
    }

    public void setLoanProduct(LoanProduct loanProduct) {
        this.loanProduct = loanProduct;
    }

    public void setApplicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate;
    }

    public void setRequestedAmount(BigDecimal requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    public void setRequestedTenureMonths(int requestedTenureMonths) {
        this.requestedTenureMonths = requestedTenureMonths;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCalculatedEmiAmount(BigDecimal calculatedEmiAmount) {
        this.calculatedEmiAmount = calculatedEmiAmount;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public long getId() {
        return id;
    }

    public ApplicantProfile getApplicant() {
        return applicant;
    }

    public LoanProduct getLoanProduct() {
        return loanProduct;
    }

    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    public BigDecimal getRequestedAmount() {
        return requestedAmount;
    }

    public int getRequestedTenureMonths() {
        return requestedTenureMonths;
    }

    public String getStatus() {
        return status;
    }

    public BigDecimal getCalculatedEmiAmount() {
        return calculatedEmiAmount;
    }

    public String getNotes() {
        return notes;
    }

    
}
