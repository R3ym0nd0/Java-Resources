package practice;

import java.util.Scanner;
import java.util.ArrayList;

public class MiniOnlineEnrollment {

    String name;
    int age;
    int idNumber;

    // constructor
    MiniOnlineEnrollment(String name, int age, int idNumber) {
        this.name = name;
        this.age = age;
        this.idNumber = idNumber;
    }

    // introduce method
    String introduce() {
        return String.format("Hello, My name is %s", this.name);
    }

    String ageInfo() {
        return String.format("My age is %d", this.age);
    }

    String idInfo() {
        return String.format("My ID Number is %d", this.idNumber);
    }

    // main program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<MiniOnlineEnrollment> students = new ArrayList<>();

        int number = 0;

        while (true) {
            try {
                System.out.print("[+] Online Enrollment [+]\n");
        
                System.out.print("\tEnter Your Full Name: ");
                String studentName = input.nextLine();
                
                System.out.print("\tEnter Your Age: ");
                int studentAge = input.nextInt();

                System.out.print("\tEnter Your ID Number: ");
                int studentIDNumber = input.nextInt();

                MiniOnlineEnrollment student = new MiniOnlineEnrollment(studentName, studentAge, studentIDNumber);
                students.add(student);

                System.out.println("\n[+] Enrolled Student Number: " + ++number);
                System.out.println("\tStudent Name: " + studentName);
                System.out.println("\tStudent Age: " + studentAge);
                System.out.println("\tStudent ID Number: " + studentIDNumber);

            } catch (Exception error){
                System.out.println("\nError: Something went wrong: " + error + "\n");
                input.nextLine();
                continue;
            }
            
            while (true) {
                System.out.print("\n[+] Do you wanna continue (Y|N): ");
                String option = input.next();

                if (option.equalsIgnoreCase("y")) {
                    input.nextLine();
                    System.out.println();
                    break;
                } else if (option.equalsIgnoreCase("n")) {
                    System.out.println("\nAll enrolled students:");

                    for (MiniOnlineEnrollment s : students) {
                        System.out.println(" - " + s.introduce() + ", " + s.ageInfo() +  ", " + s.idInfo());
                    }

                    System.out.println("\nExiting program...");

                    input.close();
                    return;
                } else {
                    System.out.println("Invalid option, please try again");
                }
            }  
        }
    }
}
