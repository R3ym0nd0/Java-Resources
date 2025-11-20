import javax.swing.JOptionPane;

public class SwingAgeChecker {
    public static void main(String[] args) {

        try {
            String name = JOptionPane.showInputDialog(null, "What is your name?,", "Name Input", JOptionPane.QUESTION_MESSAGE);
            String ageString = JOptionPane.showInputDialog(null, "How old are you?", JOptionPane.QUESTION_MESSAGE);
            
            String message;
            int age = Integer.parseInt(ageString);

            if (age < 18){
                message = "Hey ! " + name + " You`re a teenager ! Enjoy your youth ";
            
            }
            else if (age<60){
                message = "Hey! " + name + " You`re an adult ! Enjoy paying bills ";
            }
            else{
                message = "Hey! " + name + " You`re wise and experience stay healthy ";
            }
            
            JOptionPane.showMessageDialog(null, message, "greeting", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please type age", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid age.", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        
    }
}
