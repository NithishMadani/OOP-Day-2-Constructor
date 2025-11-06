package com.codegnan.oopexamples;
public class Loan {
    int loanId;
    String customerName;
    double loanAmount;
    String loanType;


public Loan() {
    this(0, "Unknown", 0.0, "Unknown");
}


public Loan(int loanId, String customerName) {
    this(loanId, customerName, 0.0, "Unknown");
}


public Loan(int loanId, String customerName, double loanAmount) {
    this(loanId, customerName, loanAmount, "Unknown");
}


public Loan(int loanId, String customerName, double loanAmount, String loanType) {
    this.loanId = loanId;
    this.customerName = customerName;
    this.loanAmount = loanAmount;
    this.loanType = loanType;
}


public double getInterestRate() {
    if (this.loanType.equalsIgnoreCase("Home")) {
        return 8.0;
    } else if (this.loanType.equalsIgnoreCase("Car")) {
        return 9.0;
    } else if (this.loanType.equalsIgnoreCase("Personal")) {
        return 11.0;
    } else {
        return 0.0;
    }
}


public double calculateTotalPayable() {
    double interestRate = this.getInterestRate();
    return this.loanAmount + (this.loanAmount * interestRate / 100);
}


public void displayLoanDetails() {
    System.out.println("Loan Details:");
    System.out.println("Loan ID: " + this.loanId);
    System.out.println("Customer Name: " + this.customerName);
    System.out.println("Loan Amount: " + this.loanAmount);
    System.out.println("Loan Type: " + this.loanType);
    System.out.println("Total Payable: " + this.calculateTotalPayable());
}
}
