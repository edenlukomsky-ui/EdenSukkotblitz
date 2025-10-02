package com.example.basicjavaworkspace;
import java.util.Scanner;

public class ChallengeJava4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter score (0-100): ");
        int score = scanner.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("invalid score. Please enter a number between 0 and 100.");
            scanner.close();
            return;
        }
        String Grade;
        if (score >= 90) {
            Grade = "A";
        } else if (score >= 80) {
            Grade = "B";
        } else if (score >= 70) {
            Grade = "C";
        } else if (score >= 60) {
            Grade = "D";
        } else {
            Grade = "F";
    }
        System.out.println("Score: " + score);
        System.out.println("Grade: " + Grade);
        scanner.close();

    }

    }

