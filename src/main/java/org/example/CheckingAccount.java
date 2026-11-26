package org.example;

public class CheckingAccount extends BankAccount {
    private final double monthlyFee;

    public CheckingAccount(String accountNumber, double balance, double monthlyFee) {
        super(accountNumber, balance);
        this.monthlyFee = monthlyFee;
    }

    public void chargeMonthlyFee() {
        withdraw(monthlyFee);
    }

    @Override
    public String getAccountType() {
        return "checking";
    }

    @Override
    public double getMonthlyCost() {
        return 50.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " checking";
    }
}
