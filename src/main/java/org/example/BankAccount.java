package org.example;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

abstract class BankAccount {
    private final String accountNumber; // final - ustawiany raz
    private double balance; // private - niedostepne z zewnatrz
    private static int accountsCreated = 0; // jedno na klase
    private static final double MIN_INITIAL_BALANCE = 0.0; // stala
    private static int nextNumber = 100;

    private final List<String> history = new ArrayList<>();

    // konstruktor prywatny idzie w parze z metodami wytworczymi po to zeby ich nie omijac przy tworzeniu obiektu
//    private BankAccount(String accountNumber, double balance) {
//        if (accountNumber == null || accountNumber.isBlank()) {
//            throw new IllegalArgumentException("Numer konta jest wymagany");
//        }
//
//        if (balance < 0) {
//            throw new IllegalArgumentException("Saldo nie moze byc ujemne");
//        }
//
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//        history.add("WPLATA:" + balance);
//    }

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


    // constructor chaining
    public BankAccount(String accountNumber) {
        this(accountNumber, 0.0); // musi byc pierwsza instrukcja
    }

    public BankAccount(BankAccount other) {
        this(other.accountNumber, other.balance);
        this.history.addAll(other.history);
    }

    public abstract String getAccountType();

    public abstract double getMonthlyCost();

    // metoda wytworcza - statyczna metoda zwracajaca obiekt swojej klasy
//    public static BankAccount open(double initialBalance) {
//        return new BankAccount("PL" + ++nextNumber, initialBalance);
//    }

//    public static BankAccount openWithBonus(double initialBalance) {
//        BankAccount account = open(initialBalance);
//        account.deposit(150);
//        return account;
//    }

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


    // overload
    public void deposit(double amount) {
        deposit(amount, "WPŁATA");
    }

    // overload
    public void deposit(double amount, String description) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Kwota wplaty musi byc dodatnia");
        }

        balance += amount;
        history.add(description);
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

    public static int getAccountsCreated() {
        return accountsCreated;
    }

    public void depositAll(double... amounts) { // varargs, tylko jeden w metodzie i tylko na koncu
        for (double amount : amounts) {
            deposit(amount);
        }
    }

    @Override
    public String toString() {
        return String.format("BankAccount[%s, saldo=%.2f]", accountNumber, balance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BankAccount other = (BankAccount) o;
        return Objects.equals(accountNumber, other.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);

    }

    public String getDescription() {
        return String.format("%s: %.2f zł", accountNumber, balance);
    }


    // final na metodzie - nie da sie jej nadpisac
    public final String formatBalance() {
        return String.format("%.2f PLN", balance);
    }


}
