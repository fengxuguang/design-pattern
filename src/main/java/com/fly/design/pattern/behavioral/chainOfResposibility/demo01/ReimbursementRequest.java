package com.fly.design.pattern.behavioral.chainOfResposibility.demo01;

/**
 * Created by fengxuguang on 2024/12/24 17:14
 */
public class ReimbursementRequest {

    private double amount;
    private String description;

    public ReimbursementRequest(double amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

}
