package practice;
import javax.swing.JOptionPane;

public class SwingAgeAndColorChecker {
    public static void main(String[] args) {

        String name = "";
        int age = 0;
        String color = "";

        while (true) {
            name = JOptionPane.showInputDialog(null, "What is your name?", "Name Input", JOptionPane.QUESTION_MESSAGE);
            
            if (name == null) {
                exitProgram();
            } else if (name.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please Enter a valid name", "error", JOptionPane.ERROR_MESSAGE);
            } else {
                break;
            }
        }

        while (true) {
            String ageStr = JOptionPane.showInputDialog(null, "How old are you", "Age input", JOptionPane.QUESTION_MESSAGE);
            
            if (ageStr == null) {
                exitProgram();
            }

            try {
                age = Integer.parseInt(ageStr.trim());

                if (age <= 0) {
                    JOptionPane.showMessageDialog(null, "Please Enter a positive number for age", "error", JOptionPane.ERROR_MESSAGE);
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid Number", "error", JOptionPane.ERROR_MESSAGE);
            } 
        }

        color = JOptionPane.showInputDialog(null, "What is your favorite color?", "Color input", JOptionPane.QUESTION_MESSAGE);
        if (color == null || color.trim().isEmpty()) {
            color = "a mystery color";
        }    

        String message;

        if (age < 18) {
            message = "Hey " + name +  "! You're still young and full of energy!";
        } else if (age < 60) {
            message = "Hello " + name + "! Keep chasing your dreams!"; 
        } else {
            message = "Hi " + name + "! You're full of wisdom and experience!";
        }

        message += "\nYour favorite color is " + color + "! Nice choice!";

        JOptionPane.showMessageDialog(null, message, "Personalized greetings", JOptionPane.INFORMATION_MESSAGE);
        exitProgram();

    }

    private static void exitProgram() {
        JOptionPane.showMessageDialog(null, "Goodbye!", "Exit", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}