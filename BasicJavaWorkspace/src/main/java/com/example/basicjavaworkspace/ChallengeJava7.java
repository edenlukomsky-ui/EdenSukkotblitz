package com.example.basicjavaworkspace;
import java.util.Scanner;

public class ChallengeJava7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();
        boolean IsPrime = true;
        if (number <= 1) {
            IsPrime = false;
        } else if (number == 2) {
            IsPrime = true;
        }
        else if (number % 2 == 0) {
            IsPrime = false;
        } else {
            int i = 3;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    IsPrime = false;
                    break;
                }
            }
        }
        if (IsPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        scanner.close();
    }
}