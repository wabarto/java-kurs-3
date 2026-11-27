package org.example;

public class PremiumInterest implements InterestPolicy {
    @Override
    public double calculate(double balance) {
        return balance > 10_000 ? balance * 0.05 : balance * 0.03;
    }
}
