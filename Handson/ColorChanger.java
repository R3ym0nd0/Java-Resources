import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChanger {

    public static void main(String[] args) {

        JFrame welcomeFrame = new JFrame("Welcome");
        welcomeFrame.setSize(400, 300);
        welcomeFrame.setLayout(null);
        welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        welcomeFrame.setLocationRelativeTo(null);
        welcomeFrame.setResizable(false);
        welcomeFrame.getContentPane().setBackground(Color.LIGHT_GRAY);

        JLabel welcomeLine1 = new JLabel("Welcome To", JLabel.CENTER);
        welcomeLine1.setBounds(50, 40, 300, 30);
        welcomeLine1.setFont(new Font("Arial", Font.PLAIN, 18));

        JLabel welcomeLine2 = new JLabel("Button Color Changer", JLabel.CENTER);
        welcomeLine2.setBounds(50, 70, 300, 35);
        welcomeLine2.setFont(new Font("Arial", Font.BOLD, 20));

        JButton startBtn = new JButton("START");
        startBtn.setBounds(150, 130, 100, 40);
        startBtn.setFont(new Font("Arial", Font.BOLD, 14));

        JLabel devLabel1 = new JLabel("Coded by: John Michael Toel", JLabel.CENTER);
        devLabel1.setBounds(50, 220, 300, 20);
        devLabel1.setFont(new Font("Arial", Font.ITALIC, 15));

        welcomeFrame.add(welcomeLine1);
        welcomeFrame.add(welcomeLine2);
        welcomeFrame.add(startBtn);
        welcomeFrame.add(devLabel1);

        welcomeFrame.setVisible(true);

        startBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                welcomeFrame.dispose();

                JFrame frame = new JFrame("Color Changer");
                frame.setSize(400, 300);
                frame.setLayout(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);

                frame.getContentPane().setBackground(Color.LIGHT_GRAY);

                JLabel title = new JLabel("BUTTON COLOR CHANGER", JLabel.CENTER);
                title.setBounds(50, 20, 300, 30);
                title.setFont(new Font("Arial", Font.BOLD, 18));

                JButton redBtn = new JButton("RED");
                JButton blueBtn = new JButton("BLUE");
                JButton greenBtn = new JButton("GREEN");

                Font btnFont = new Font("Arial", Font.BOLD, 12);
                redBtn.setFont(btnFont);
                blueBtn.setFont(btnFont);
                greenBtn.setFont(btnFont);

                redBtn.setBounds(50, 80, 120, 40);
                blueBtn.setBounds(230, 80, 120, 40);
                greenBtn.setBounds(140, 150, 120, 40);

                redBtn.addActionListener(a ->
                        frame.getContentPane().setBackground(Color.RED)
                );
                blueBtn.addActionListener(a ->
                        frame.getContentPane().setBackground(Color.BLUE)
                );
                greenBtn.addActionListener(a ->
                        frame.getContentPane().setBackground(Color.GREEN)
                );

                JLabel devLabel2 = new JLabel("Coded by: John Michael Toel", JLabel.CENTER);
                devLabel2.setBounds(50, 230, 300, 20);
                devLabel2.setFont(new Font("Arial", Font.ITALIC, 15));

                frame.add(title);
                frame.add(redBtn);
                frame.add(blueBtn);
                frame.add(greenBtn);
                frame.add(devLabel2);

                frame.setVisible(true);
            }
        });
    }
}