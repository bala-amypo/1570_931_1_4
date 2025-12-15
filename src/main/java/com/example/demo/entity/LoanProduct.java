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

    public LoanProduct(String productCode, String productName, String loanType, BigDecimal minAmount,
            BigDecimal maxAmount, int minTenureMonths, int maxTenureMonths, double annualInterestRatePercent,
            int baseRiskWeight) {
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

    
}
