package com.example.demo.entity;

import java.math.BigDecimal;

public class LoanProduct {
    private long id;
    private String productCode;
    private String productName;
    private String loanType;
    private BigDecimal minAmount;
    private BigDecimal maxAmount;
    private int minTenureMonths;
    private int maxTenureMonths;
    private double annualInterestRatePercent;
    private int baseRiskWeight;

    public LoanProduct() {}

    public LoanProduct(String productCode, String productName, String loanType, BigDecimal minAmount, BigDecimal maxAmount, int minTenureMonths, int maxTenureMonths, double annualInterestRatePercent, int baseRiskWeight) {
        this.productCode = productCode;
        this.productName = productName;
        this.loanType = loanType;
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.minTenureMonths = minTenureMonths;
        this.maxTenureMonths = maxTenureMonths;
        this.annualInterestRatePercent = annualInterestRatePercent;
        this.baseRiskWeight = baseRiskWeight;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public void setMinAmount(BigDecimal minAmount) {
        this.minAmount = minAmount;
    }

    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    public void setMinTenureMonths(int minTenureMonths) {
        this.minTenureMonths = minTenureMonths;
    }

    public void setMaxTenureMonths(int maxTenureMonths) {
        this.maxTenureMonths = maxTenureMonths;
    }

    public void setAnnualInterestRatePercent(double annualInterestRatePercent) {
        this.annualInterestRatePercent = annualInterestRatePercent;
    }

    public void setBaseRiskWeight(int baseRiskWeight) {
        this.baseRiskWeight = baseRiskWeight;
    }

    public long getId() {
        return id;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public String getLoanType() {
        return loanType;
    }

    public BigDecimal getMinAmount() {
        return minAmount;
    }

    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    public int getMinTenureMonths() {
        return minTenureMonths;
    }

    public int getMaxTenureMonths() {
        return maxTenureMonths;
    }

    public double getAnnualInterestRatePercent() {
        return annualInterestRatePercent;
    }

    public int getBaseRiskWeight() {
        return baseRiskWeight;
    }

    
    
}
