package com.example.basicjavaworkspace;
 import java.util.Scanner;
public class Text_Based_Adventure_Game_Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health = 50;
        int gold = 15;
        boolean hasIronSword = false;
        String name;
        //---Character Setup---
        while (true) {
            System.out.println("Hello Traveler! What is your name?:");
            name = scanner.nextLine();
            if (name.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.println("Invalid name! Please enter letters only.");
            }
        }

        System.out.println("Hello " + name + " You have: " + health + " health" + " and " + gold + " gold");
        System.out.println("you see two roads ahead of you:");
        System.out.println("Road A, That leads you to an abandoned tower.");
        System.out.println("Road B, That leads you to a small cave. ");
        System.out.println("What road are you choosing?:");
        String choice = scanner.nextLine();
        // ---Story Branching---
        String choice2;
        String choice3 = null;

        if (choice.equalsIgnoreCase("Road A")) {
            System.out.println("You encounter a knight's skeleton. You have acquired an iron sword!");
            hasIronSword = true;
            System.out.println("Your only option now is to go to Road B. Are you going? (yes/no):");
            choice2 = scanner.nextLine();

            if (choice2.equalsIgnoreCase("yes")) {
                System.out.println("You enter the cave in it you have encountered a dragon!");
                System.out.println("Do you fight it? (yes/no)");
                choice3 = scanner.nextLine();

                if (choice3.equalsIgnoreCase("yes")) {
                    System.out.println("You have defeated the dragon!");
                    int reward = 1000;
                    System.out.println("You have been rewarded with " + reward + " gold!");
                    gold += reward;
                    System.out.println("You now have " + gold + " gold");
                    System.out.println("Congratulations, " + name + "! You WON!");
                    System.out.println("You go back home to enjoy your riches and life as a hero!");
                }else {
                    System.out.println("You flee from the dragon and return home safely.");
                    System.out.println("You survived, but you will always wonder what could have been...");
                }
            } else {
                System.out.println("You decided not to risk it and head home. The Adventure Ends.");
            }

        } else if (choice.equalsIgnoreCase("road b")) {
            System.out.println("You have encountered a dragon! Are you fighting it?");
            choice3 = scanner.nextLine();

            if (choice3.equalsIgnoreCase("yes")) {
                if (hasIronSword) {
                    System.out.println("You have defeated the dragon!");
                    gold += 1000;
                    System.out.println("You earn 1000 gold! You now have " + gold + " gold.");
                    System.out.println("You Won");
                }else {
                    health -= 50;
                    System.out.println("Without a sword the dragon defeats you.");
                    System.out.println("You Lost");
                }
            }else {
                System.out.println("You have run home to save yourself in the price of your honor. You are now known as: " + name + " the coward. The Adventure Ends.");
                System.out.println();
            }
        }else {
            System.out.println("That is an invalid road choice. The game ends before the adventure begins.");
        }
        System.out.println("The End");
        scanner.close();
    }
}
