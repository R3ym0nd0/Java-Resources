import java.util.InputMismatchException;
import java.util.Scanner;

public class MiniLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int attempts = 0;
        String correctUseraname = "admin";
        String correcStringtPassword = "password123";

        System.out.println("Welcome to the Login System\n");

        while (attempts < 4) {
            System.out.print("\t[+] Enter Your Username: ");
            String username = input.nextLine();

            System.out.print("\t[+] Enter Your Password: ");
            String password = input.nextLine();

            if (username.equals(correctUseraname) && password.equals(correcStringtPassword)) {
                System.out.println("\nLogin Successful!");
                break;
            } else {
                attempts++;
                System.out.println("\n[!!] Invalid username or password. Please try again. [!!]");
                System.out.println("Attempts remaining: " + (4 - attempts) + "\n");
            }
        }

        if (attempts == 4) {
            System.out.println("==> Too many failed attempts. Access denied. <==");
        }

        System.out.println("\n--- Age Verification for Voting Eligibility ---\n");

        while (true) {
            try {
                System.out.print("\t[+] What's Your Age: ");
                int age = input.nextInt();

                if (age < 1 || age > 121) {
                    System.out.println("\n[!!] Please enter a valid age between 1 and 120. [!!]\n");
                } else if (age >= 18) {
                    System.out.println("\nYou Eligible to Vote: " + age);
                    break;
                } else {    
                    System.out.println("\nYou Ineligible to Vote: " + age);
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("\n[!!] Invalid input. Please enter a valid age. [!!]\n");
                input.next();
            } catch (Exception e) {
                System.out.println("\nAn error occurred: " + e.getMessage() + "\n");
            }
        }

        input.close();
    }

}
