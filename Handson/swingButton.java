package practice;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swingButton {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("My JFrame Example");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        // Create a button
        JButton button = new JButton("Click me");
        button.setBounds(80, 70, 140, 40); // x, y, width, height

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button was clicked!");
            }
        });

        // Add button to the frame
        frame.add(button);

        // Make frame visible
        frame.setVisible(true);
    }
}