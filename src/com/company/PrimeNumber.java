package com.company;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        //variables
        int count;
        int input;

        //User inputs random numner
        System.out.print("Enter a random number: ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();

        for (count =1; count<=input; count++) {
            if (Prime(count)) {
                System.out.println(count + " is a prime number");
            }
            else System.out.println(count + " is not a prime number");

        }
    }

    public static boolean Prime(int count2) {
        if (count2 <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(count2); i++) {
            if (count2 % i == 0) {
                return false;
            }
        }
        return true;
    }
}