package practice;

import java.util.Scanner;

public class MiniGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user subject grades
        System.out.print("Enter your grades in Environmental Science: ");
        double environmentalScience = input.nextDouble();

        System.out.print("Enter your grades in Object Oriented Programming: ");
        double OOP =  input.nextDouble();

        System.out.print("Enter your grades in Data Structures: ");
        double dataStructures =  input.nextDouble();

        System.out.print("Enter your grades in Management and Organization: ");
        double organizationManagement =  input.nextDouble();
        
        System.out.print("Enter your grades in Ethics: ");
        double ethics =  input.nextDouble();

        System.out.print("Enter your grades in Physical Education: ");
        double physicalEducation =  input.nextDouble();

        System.out.print("Enter your grades in Network Infrastructure: ");
        double networkInfrastructure =  input.nextDouble();

        // GWA Calculation
        double total = environmentalScience + OOP + dataStructures + organizationManagement + ethics + physicalEducation + networkInfrastructure;
        double gwa = total / 7;

        // Output depends on GWA Average
        if (gwa > 100 || gwa < 50) {
            System.out.printf("Invalid Grade: %.2f", gwa);
        } else if (gwa >= 98) {
            System.out.printf("With Highest Honor: %.2f", gwa);
        } else if (gwa >= 95) {
            System.out.printf("With High Honor:%.2f", gwa);
        } else if (gwa >= 90) { 
            System.out.printf("With Honor: %.2f", gwa);
        } else if (gwa >= 75) {
            System.out.printf("Passed: %.2f", gwa);
        } else {
            System.out.printf("You Failed: %.2f", gwa);
        }

        input.close();
    }
}