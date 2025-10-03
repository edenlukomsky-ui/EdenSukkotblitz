package com.example.basicjavaworkspace;
import java.util.Scanner;

public class ChallengeJava5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table (1-10): ");
        int number = scanner.nextInt();

        int i = 1;
        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number*i));
            i++;
        }

        scanner.close();

    }
}
