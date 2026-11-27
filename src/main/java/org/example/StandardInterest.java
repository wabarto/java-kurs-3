package org.example;

public class StandardInterest implements InterestPolicy {
    @Override
    public double calculate(double balance) {
        return balance * balance;
    }
}
