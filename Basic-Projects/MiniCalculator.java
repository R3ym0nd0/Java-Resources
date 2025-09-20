package practice;

import java.util.Scanner;

public class MiniCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("[*] Mini Calculator [*]\n");

        try {
            while (true) {
                int result;

                System.out.print("\t[+] Enter First Number: ");
                int firstNum = input.nextInt();

                System.out.print("\t[+] Choose an Operator (*, /, -. +): ");
                String operator = input.next();

                System.out.print("\t[+] Enter Second Number: ");
                int secondNum = input.nextInt();

                switch (operator) {
                    case "*":
                        result = firstNum * secondNum; 
                        System.out.printf("\n--> Result: %d\n\n", result);
                        break;
                    case "/":
                        result = firstNum / secondNum;
                        System.out.printf("\n--> Result: %d\n\n", result);
                        break;
                    case "-":
                        result = firstNum - secondNum;
                        System.out.printf("\n--> Result: %d\n\n", result);
                        break;
                    case "+":
                        result = firstNum + secondNum;
                        System.out.printf("\n--> Result: %d\n\n", result);
                        break;
                    default:
                        System.out.println("\n[!!] Invalid Operator, please try again [!!]\n");
                }

                System.out.print("[?] Do you wanna continue (Y|N): ");
                String option = input.next();

                if (option.equalsIgnoreCase("y")) {
                    System.out.println();
                    continue;
                }  else if (option.equalsIgnoreCase("n")) {
                    System.out.println("\n[*] Thank you for using my calculator :) [*]");
                    input.close();
                    break;
                } else {
                    System.out.println("\n[!!] Invalid Choice, Please enter Y or N [!!]\n");
                }
            }   
        } catch (Exception error) {
            System.out.printf("[!!] Something went wrong: %s [!!]", error);
        }
    }   
}