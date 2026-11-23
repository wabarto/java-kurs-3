package org.example;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private final String accountNumber; // final - ustawiany raz
    private double balance; // private - niedostepne z zewnatrz

    private final List<String> history = new ArrayList<>();

    public BankAccount(String accountNumber, double balance) {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Numer konta jest wymagany");
        }

        if (balance < 0) {
            throw new IllegalArgumentException("Saldo nie moze byc ujemne");
        }

        this.accountNumber = accountNumber;
        this.balance = balance;
        history.add("WPLATA:" + balance);
    }

    public double getBalance() {
        return balance;
    }

    // metoda biznesowa
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Kwota wyplaty musi byc dodatnia");
        }

        if (amount > balance) {
            throw new IllegalStateException("Brak srodkow");
        }

        balance -= amount;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Kwota wplaty musi byc dodatnia");
        }

        balance += amount;
    }

//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public List<String> getHistory() {
//        return List.copyOf(history);
        return new ArrayList<>(history);
    }

}
