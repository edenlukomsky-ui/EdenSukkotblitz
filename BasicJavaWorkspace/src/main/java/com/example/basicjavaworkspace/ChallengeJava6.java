package com.example.basicjavaworkspace;
import java.util.Random;
import java.util.Scanner;

public class ChallengeJava6 {
    public static void main(String[] args) {
        Random random = new Random();
        int number;
        number = random.nextInt(1, 51);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number 1-50: ");
        int guess = scanner.nextInt();
        while (guess != number) {
            System.out.println("Incorrect guess. Try again! ");
            if (guess > number) {
                System.out.println("Hint: Too high.");
            } if (guess < number) {
                System.out.println("Hint: Too low.");
            }
            }
            guess = scanner.nextInt();
        }

    }

