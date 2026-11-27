package org.example;

public class NoInterest implements InterestPolicy {
    @Override
    public double calculate(double balance) {
        return 0;
    }
}
