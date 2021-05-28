package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.println("Factorial n: " + factorial(n));
        System.out.print("Enter k: ");
        int k = scanner.nextInt();
        System.out.println("Pow(n, k): " + pow(n, k));
        System.out.print("Enter num: ");
        int num = scanner.nextInt();
        System.out.println("Sum nums: " + sum(num));
    }

    private static int factorial(int n) {
        if (n == 1)
            return n;
        if (n == 0)
            return 0;
        return factorial(n - 1) * n;
    }

    private static int pow(int n, int k) {
        if (k == 0)
            return 1;
        else if (k == 1)
            return n;
        else
            return n * pow(n, k - 1);
    }

    private static int sum(int num) {
        if (num % 10 == num / 10)
            return num;
        return num % 10 + sum(num / 10);
    }
}
