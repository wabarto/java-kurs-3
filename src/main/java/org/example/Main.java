package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int operationCount = 0; // POLE KLASY - widoczne w calej klasie

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


        String rawNumber = "    pl01 2345 6789  ";

        System.out.println(rawNumber.strip());
        System.out.println(rawNumber.trim());
        System.out.println(rawNumber.isBlank());
        System.out.println(rawNumber.length());
        System.out.println(rawNumber.contains("2345"));
        System.out.println(rawNumber.toUpperCase());
        System.out.println(rawNumber.toLowerCase());
        System.out.println(rawNumber.replace(" ", ""));
        System.out.println(rawNumber.substring(2, 6));
        System.out.println(rawNumber.substring(2));
        System.out.println(rawNumber.charAt(5));
        System.out.println(rawNumber.indexOf("2345"));
        System.out.println(rawNumber.indexOf("xyz"));
        System.out.println(rawNumber.startsWith("pl"));
        System.out.println(rawNumber.endsWith("pl"));
        String[] strings = rawNumber.split(" ");

        for (int j = 0; j < strings.length; j++) {
            System.out.print(strings[j] + " ");
        }

        System.out.println(rawNumber.equalsIgnoreCase("    PL01 2345 6789  "));


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Wyplata: ");
//        int amount1 = scanner.nextInt();
//
//        // 1
//        scanner.nextLine();
//
//        System.out.println("Tytuł: ");
//        String title = scanner.nextLine();
//        System.out.println("Tytul: " + title);


        // 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wyplata: ");
        int amount1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Tytuł: ");
        String title = scanner.nextLine();
        System.out.println("Tytul: " + title);

        // text block
        String tekst = """
                12322
                12112
                121221
                """;

        System.out.println(tekst);



        int balance1 = 100;

        if (balance1 > 50) {
            balance1 = balance1 * 2;
        }


        if (!(balance1 > 150 || balance1 == 0)) {
            balance1 = balance1 + 100;
        }


        if (balance1 > 150 && balance1 < 300) {
            balance1 = balance1 + 100;
        }


        // stara skladnia
        int option = 2;
        String label;

        switch (option) {
            case 1: label = "1"; break;
            case 2: label = "2"; break;
            default: label = "UNKNOWN"; break;

        }


        String newLabel = switch (option) {
            case 1 -> {
                System.out.println("test");
                yield "1";
            }
            case 2 -> "2";
            default -> "UNKNOWN";
        };


        // warunek ? wartoscGdyPrawda : wartoscGdyFalsz - to jest wyrazenie, ktore zwraca wartosc

        boolean active1 = true;
        String accountNumber = "PL01";

        String status = active1 ? "AKTYWNE" : "ZABLOKOWANE";


        String displayNumber = accountNumber != null ? accountNumber : "brak";

        // tak nie robimy
        String tier = balance1 > 10000 ? calculateTier() : (balance > 1000 ? "standard" : (balance > 0 ? "basic" : "debt"));


        // tak robimy jesli mamy wiele warunkow
        if (balance1 > 10000) {
            tier = "premium";
        } else if (balance1 > 1000) {
            tier = "standard";
        } else if (balance > 0) {
            tier = "basic";
        } else {
            tier = "debt";
        }


        for (int j = 0; j < 3; j++) {
            System.out.println(j);
        }

        for (int j = 3; j >= 1; j--) {
            System.out.println(j);
        }

        for (int j = 50; j <= 500; j += 50) {
            System.out.println(j);
        }


        int balance3 = 0;
        while (balance3 > 100) {
            System.out.println("To sie nie wykona");
        }

        int attempt = 0;

        do {
            attempt++;
            System.out.println("attempt: " + attempt);
        } while (attempt < 3);

        int[] array = {500, 200, 100, 50};

        for (int element : array) {
            System.out.println(element);
        }


        for (int j = 0; j < 4; j++) {
            if (j == 2) {
                System.out.println("do something");
                break;
            }
            System.out.println(j);
        }

        for (int j = 0; j < 4; j++) {
            if (j == 2) {
                System.out.println("do something");
                continue;
            }
            System.out.println(j);
        }

        // break - przerywa petle natychmiast
        // continue - pomija reszte biezacej iteracji i przechodzi do nastepnej

        int n = 1000;
        int operations = 0;

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                operations++;
            }
        }

        System.out.println(operations);



        // arrays

        int[] g = {1, 2, 3}; // z wartosciami

        int[] t = new int[5]; // z rozmiarem

        int[] z;
        z = new int[]{1, 2, 3}; // rozdzielnie, deklaracja a potem przypisanie

        System.out.println(z.length);

//        System.out.println(z[3]);


        int[] amounts = {100, 200, 500};

        int sum = 0;

        for (int amt : amounts) {
            sum += amt;
        }

        for (int amt : amounts) {
            amt = 0;
        }

        System.out.println(Arrays.toString(amounts));

        for (int j = 0; j < amounts.length; j++) {
            amounts[j] = 0;
        }

        System.out.println(Arrays.toString(amounts));


        // FAKE
        int[] fakeCopy = amounts;
        fakeCopy[0] = 999;
        System.out.println(amounts[0]);


        // REAL

        int[] realCopy = Arrays.copyOf(amounts, amounts.length);
        realCopy[0] = 1;
        System.out.println(amounts[0]);

        int[] sorted = Arrays.copyOf(amounts, amounts.length);
        Arrays.sort(sorted);

        System.out.println(amounts); // oryginal
        System.out.println(sorted); // rosnaco

        int[] lastThree = Arrays.copyOfRange(amounts, 1, 3);
        System.out.println(Arrays.toString(lastThree));
        System.out.println(Arrays.toString(amounts));

        Arrays.fill(amounts, 0);
        System.out.println(Arrays.toString(amounts));

        int[][] weekly = new int[3][7];
        // weekly[row][column]
        // liczba wierszy to weekly.length
        System.out.println(weekly.length);
        // weekly[0].length

        // tablica poszarpana
        int[][] weekly1 = {
                {100, 200, 300, 400},
                {200, 100, 300},
                {600, 250, 300, 1, 5}
        };

        System.out.println(weekly1[2][3]);

        for (int row = 0; row < weekly1.length; row++) {
            for (int column = 0; column < weekly1[row].length; column++) {
                System.out.print(weekly1[row][column] + " ");
            }
            System.out.println();

        }





        // m[r][c] - > m[c][r]
        // 7 x 4 -> 4 x 7
        // new int[columns][rows]


        int rows = weekly.length;
        int cols = weekly[0].length;

        int[][] transposed = new int[cols][rows];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                transposed[col][row] = weekly[row][col];
            }
        }

        for (int[] line : transposed) {
            int m = 0; // zmienna blokowa - dostepna tylko w tym bloki
            System.out.println(Arrays.toString(line));
        }

        int m = 5;
        increase(5);
        System.out.println(m);

        int[] numbers = {1, 2, 3};
        zeroFirst(numbers);
        System.out.println(numbers[0]);

        replace(numbers);
        System.out.println(Arrays.toString(numbers));


        System.out.println(factorial(4));

//        broken(5); - StackOverflowError


        long start = System.nanoTime();
        System.out.println(fibonacciRecursive(40));
        System.out.println("Rekurencyjnie: " + (System.nanoTime() - start) / 1_000_000);

        start = System.nanoTime();
        System.out.println(fibonacciIterative(40));
        System.out.println("Iteracyjnie: " + (System.nanoTime() - start) / 1_000_000);


        System.out.println(power(2, 10));


    }


    // metoda zmienia swoja kopie a nie oryginal - typy proste
    public static void increase(int number) {
        number = number + 100;
    }

    // metoda moze zmienic wartosc obiektu
    public static void zeroFirst(int[] array) {
        array[0] = 0;
    }

    // metoda nie moze podmienic samego obiektu
    public static void replace(int[] array) {
        array = new int[]{9, 9, 9};
    }

    static String calculateTier() {
        int a = 0; // zmienna lokalne - widoczna w tej metodzie
        System.out.println("tier");
        return "premium";
    }


    // przeciazenie
    public static String formatAccount(int cents) {
        return "cents: " + cents;
    }

    public static String formatAccount(int cents, String currency) {
        return "cents: " + cents + " currency: " + currency;
    }

    public static String formatAccount(int cents, boolean withSign) {
        String sign = withSign && cents > 0 ? "+" : "";
        return sign + formatAccount(cents);
    }

    public static String formatAccount(String currency, int cents) {
        return "cents: " + cents + " currency: " + currency;
    }


    // tak sie nie da
//    public static int formatAccount(int cents, String currency) {
//        return 1;
//    }


    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n musi byc >= 0");
        }

        if (n <= 1) { // warunek bazowy
            return 1;
        }

        return n * factorial(n - 1); // krok rekurencyjny
    }

    // niepoprawna rekurencja
    public static long broken(int n) {
        return n * broken(n - 1);
    }


    public static long fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacciRecursive(n -1) + fibonacciRecursive(n - 2);
    }

    public static long fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }

        long previous = 0;
        long current = 1;

        for (int i = 2; i <= n; i++) {
            long next = previous + current;
            previous = current;
            current = next;
        }

        return current;
    }


    // x ^ 8 = (x^4)^2, a x^4 = (x^2)^2
    public static double power(double base, int exp) {
        if (exp == 0) {
            return 1;
        }

        if (exp < 0) {
            return 1.0 / power(base, -exp);
        }

        if (exp % 2 == 0) {
            double half = power(base, exp / 2);
            return half * half;
        }

        return base * power(base, exp - 1);
    }

}