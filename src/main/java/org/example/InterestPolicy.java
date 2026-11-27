package org.example;

@FunctionalInterface
public interface InterestPolicy {
    double calculate(double balance);
}
