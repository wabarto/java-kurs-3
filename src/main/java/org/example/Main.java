package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int balance = 100_00;
        double balanceInCents = 0.03;
        boolean active = true;
        char symbol = 'Z';
        String text = "PL01";
        long customerId = 3_000_000_000L;
        float floatBalance = 0.03f;

        System.out.println(0.1 + 0.2);
        System.out.println(0.1 + 0.2 == 0.3);

        int totalWithdraw = 7;
        int transactionCount = 2;

        System.out.println(totalWithdraw / transactionCount);
        System.out.println(totalWithdraw / 2.0);
        System.out.println((double) totalWithdraw / transactionCount);

        int maxInt = Integer.MAX_VALUE;
        System.out.println(maxInt);
        System.out.println(maxInt + 1);



        int i = 5;
        int a = i++; // post - zwraca stara wartosc, potem zwieksza 5
        System.out.println(a + " " + i); // 6
//        i--;
//        --i;


        i = 5;
        int b = ++i; // pre - zwieksza a potem zwraca stara wartosc 6
        System.out.println(b + " " + i); // 6

        // rzutowanie
        int count = 42;
        double d = count;
        long l = count; // rozszerzajace

        double amount = 199.99;
        int truncated = (int) amount;
        System.out.println(truncated);

        System.out.println(Math.round(amount));

        char letter = 'A';
        System.out.println((int) letter);
        System.out.println((char) 66);

        // 00001100 - 12

        // 0 * 2^0 + 0 * 2^1 + 1 * 2^2 + 1 * 2^3 = 0 + 0 + 4 + 8 = 12

        // 12 -> 00001100
        // 12 / 2 = 6 r 0
        // 6 / 2 = 3 r 0
        // 3 / 2 = 1 r 1
        // 1 / 2 = 0 r 1

        // 1100

        int value = 12; // -12-1 = -13 // -x-1
        System.out.println(Integer.toBinaryString(value)); // 1100
        System.out.println(Integer.parseInt("1100", 2));
        System.out.println(Integer.toBinaryString(-12));


        // & - AND, bit wynikowy = 1 gdy oba bity sa 1
        // | - OR: 1, gdy przynajmniej jeden jest 1
        // ^ - XOR 1, gdy bity sa rozne: x, ~x = -x-1
        // ~ - NOT: odwraca wszystkie bity
        // << - w lewo, czyli mnozenie przez potege dwojki
        // >> - w prawo czyli dzielenie calkowite przez potege dwojki


        int a1 = 12; // 1100
        int b1 = 10; // 1010

        System.out.println(a1 & b1); // 1000 - 8
        System.out.println(a1 | b1); // 1110 - 14
        System.out.println(Integer.toBinaryString(14));
        System.out.println(a1 ^ b1); // 0110 - 6
        System.out.println(~a1); // -13
        System.out.println(~b1); // -11
        System.out.println(1 << 3); // 1 * 2^3 = 8
        System.out.println(8 >> 2); // 8 / 2^2 = 2

        // if (n % 2) == 0 - parzysta
        // if (n & 1) == 0 - parzysta - ostatni bit liczby parzystej to zawsze 0



        // KOPIOWANIE WARTOŚCI
        int balanceA = 100;
        int balanceB = balanceA;
        balanceB = 900;
        System.out.println(balanceA); // 100

        int[] historyA = {100, 200, 300};
        int[] historyB = historyA;
        historyB[0] = 999;
        System.out.println(historyA[0]);

        int[] historyC = Arrays.copyOf(historyA, historyA.length);
        historyC[0] = 1;
        System.out.println(historyA[0]);

        String text1 = "hello";
        String text2 = "hello1";
        String text4 = "hello1";
        String text3 = new String("hello1");
        String text5 = text3;
        text1.toUpperCase();
        System.out.println(text1);
        String upper = text1.toUpperCase();
        System.out.println(upper);

        System.out.println(text1 == text2);
        System.out.println(text1 == text3);
        System.out.println(text2 == text4);

        // tak jest poprawnie
        System.out.println(text2.equals(text4));


    }
}