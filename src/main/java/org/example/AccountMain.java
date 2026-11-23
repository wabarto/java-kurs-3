package org.example;

import java.util.ArrayList;
import java.util.List;

public class AccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("PL01", 1000);
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

    }
}
