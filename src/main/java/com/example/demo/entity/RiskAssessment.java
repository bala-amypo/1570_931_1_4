package com.example.demo.entity;

import java.time.LocalDateTime;

public class RiskAssessment {
    private long id;
    private LoanApplication loanApplication;
    private String eligibilityStatus;
    private String riskLevel;
    private int score;
    private double debtToIncomeRatio;
    private String remarks;
    private LocalDateTime evaluatedOn;

    public RiskAssessment() {}

    public RiskAssessment(LoanApplication loanApplication, String eligibilityStatus, String riskLevel, int score, double debtToIncomeRatio, String remarks, LocalDateTime evaluatedOn) {
        this.loanApplication = loanApplication;
        this.eligibilityStatus = eligibilityStatus;
        this.riskLevel = riskLevel;
        this.score = score;
        this.debtToIncomeRatio = debtToIncomeRatio;
        this.remarks = remarks;
        this.evaluatedOn = evaluatedOn;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLoanApplication(LoanApplication loanApplication) {
        this.loanApplication = loanApplication;
    }

    public void setEligibilityStatus(String eligibilityStatus) {
        this.eligibilityStatus = eligibilityStatus;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setDebtToIncomeRatio(double debtToIncomeRatio) {
        this.debtToIncomeRatio = debtToIncomeRatio;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setEvaluatedOn(LocalDateTime evaluatedOn) {
        this.evaluatedOn = evaluatedOn;
    }

    public long getId() {
        return id;
    }

    public LoanApplication getLoanApplication() {
        return loanApplication;
    }

    public String getEligibilityStatus() {
        return eligibilityStatus;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public int getScore() {
        return score;
    }

    public double getDebtToIncomeRatio() {
        return debtToIncomeRatio;
    }

    public String getRemarks() {
        return remarks;
    }

    public LocalDateTime getEvaluatedOn() {
        return evaluatedOn;
    }
}
