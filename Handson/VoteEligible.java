package practice;

import java.util.Scanner;

public class VoteEligible {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Type Your Name: ");
        String name = input.nextLine();

        System.out.print("Enter Your Age: ");
        int age = input.nextInt();

        System.out.println("\nHi " + name + "!\n");
        
        if (age < 1 || age > 121) {
            System.out.println("Invalid Age: " + age);
        } else if (age >= 18) {
            System.out.println("You are eligible to vote: " + age);
        } else {
            System.out.println("You are ineligible to vote: " + age);
        }

        input.close();
    }
}