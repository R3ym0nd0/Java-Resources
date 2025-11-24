import javax.swing.JOptionPane;

public class SimpleGUIAgeChecker {
    public static void main(String[] args) {
        boolean continueProgram = true;

        while (continueProgram) {
            String name = getName();
            if (name == null) exitProgram();

            int age = getAge();
            if (age == -1) exitProgram();

            String color = getColor();
            if (color == null) color = "a mystery color";
 
            String message;
            if (age < 13) {
                message = "Hey" + name + "! You're a cool kid who loves" + color + "!";
            } else if (age < 20) {
                message = "Yo " + name + "! Teenage energy and " + color + " vibes!";
            } else if (age < 60) {
                message = "Hello " + name + "! " + color + " suits your personality perfectly!";
            } else {
                message = "Hi " + name + "! " + color + " is a timeless color, just like you!";
            }

            JOptionPane.showMessageDialog(null, message, "Personalized Greeting", JOptionPane.INFORMATION_MESSAGE);

            int again = JOptionPane.showConfirmDialog(null, "Would you like to enter another person's information?", "Continue?", JOptionPane.YES_NO_OPTION);

            if (again != JOptionPane.YES_OPTION) {
                continueProgram = false;
                exitProgram();
            }
        }
    }

    private static String getName() {
        while (true) {
            String name = JOptionPane.showInputDialog(null, "What is your name?", "Name Input", JOptionPane.QUESTION_MESSAGE);

            if (name == null) return null;
            if (name.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please Enter a valid name", "error", JOptionPane.ERROR_MESSAGE);
            } else {
                return name.trim();
            }
        }
    }

    private static int getAge() {
        while (true) {
            String ageStr = JOptionPane.showInputDialog(null, "How old are you?", "Age Input", JOptionPane.QUESTION_MESSAGE);
            
            if (ageStr == null ) return -1;

            try {
                int age = Integer.parseInt(ageStr.trim());
                if (age <= 0) {
                    JOptionPane.showMessageDialog(null, "Age must be positive", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    return age;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please Enter a valid number for age", "error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static String getColor() {
        String color = JOptionPane.showInputDialog(null, "What is your favorite color?", "Color input", JOptionPane.QUESTION_MESSAGE);
        if (color == null || color.trim().isEmpty()) {
            return "a mystery color";
        }
        return color.trim();
    }

    private static void exitProgram() {
        JOptionPane.showMessageDialog(null, "Thanks for using the program! Goodbye", "Exit", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}