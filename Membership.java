package com.codegnan.oopexamples;

public class Membership {
    private String memberName;
    private String planType;
    private double monthlyFee;

    public Membership(String memberName, String planType, double monthlyFee) {
        if (memberName == null || memberName.isEmpty()) {
            throw new IllegalArgumentException("Error: Name cannot be empty");
        }
        if (planType == null || planType.isEmpty()) {
            throw new IllegalArgumentException("Error: Plan type cannot be empty");
        }
        if (monthlyFee <= 0) {
            throw new IllegalArgumentException("Error: Fee must be positive");
        }
        this.memberName = memberName;
        this.planType = planType;
        this.monthlyFee = monthlyFee;
    }

    public void displayMembership() {
        System.out.println("Member: " + memberName + ", Plan: " + planType + ", Fee: " + monthlyFee);
    }
}