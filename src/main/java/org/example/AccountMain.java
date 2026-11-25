package org.example;

import java.util.ArrayList;
import java.util.List;

public class AccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("PL01", 1000);
        BankAccount account2 = new BankAccount("PL01", 1000);

        BankAccount account1 = BankAccount.open(1000);
//        BankAccount account = BankAccount.openWithBonus(1000);

        System.out.println(account.getBalance());

        // final znaczy ze zmienna zawsze wskazuje na ten sam obiekt
        final List<String> list = new ArrayList<>();
        list.add("Mateusz");
        list.add("Bartek");

        System.out.println(list);

//        list = new ArrayList<>();  - nie mozemy zmienic referencji

//        account.setBalance(-99999);

        account.deposit(100);

        try {
            account.withdraw(-9999);
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.println("Odrzucono: " + e.getMessage());
        }
        System.out.println(account.getBalance());

        System.out.println(account.getHistory());

        account.getHistory().clear();

        System.out.println(account.getHistory());

        BankAccount.getAccountsCreated();

        account.depositAll();
        account.depositAll(10, 20, 50);
        account.depositAll(10);


        // this moze byc zwrocony w metodzie
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1").append("1");
        String text = stringBuilder.toString();
        System.out.println(text);


        System.out.println(account);
        System.out.println(account == account1);
        System.out.println(account.equals(account2));

        System.out.println(account.getClass());
        System.out.println(account.getClass().getSimpleName());

        BankAccount savingsAccount = new SavingsAccount("PL01", 1000, 0.03);
        System.out.println(savingsAccount.getDescription());

        List<BankAccount> accounts = List.of(
                new BankAccount("PL01", 1000),
                new SavingsAccount("PL02", 5000, 0.03),
                new CheckingAccount("PL03", 1000, 5.0),
                new SavingsAccount("PL04", 1000, 0.05)
        );

        for (BankAccount acc : accounts) {
            System.out.println(acc.getDescription());
        }

        double sum = 0;
        for (BankAccount acc : accounts) {
            sum += acc.getBalance();
        }

        System.out.printf("Środki w banku: %.2f zł%n", sum);

        // downcasting - rzutowanie w dol hierarchii czyli z typu ogolnego na typ konkretny

        // wersja niebiezpieczna
        SavingsAccount s = (SavingsAccount) account;

        // wersja bezpieczna z instanceOf
        if (account instanceof SavingsAccount s1) {
            s.addInterest();
            System.out.println(s1.getDescription());
        }

    }
}
