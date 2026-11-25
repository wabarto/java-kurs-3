package org.example;

public class SavingsAccount extends BankAccount {
    private final double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);

        if (interestRate < 0) {
            throw new IllegalArgumentException("interest rate >= 0");
        }

        this.interestRate = interestRate;
    }

    public void addInterest() {
        deposit(getBalance() + interestRate);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " savings";
    }


    // nie da sie nadpisac
//    @Override
//    public String formatBalance() {
//        return super.getDescription() + " savings";
//    }
}
