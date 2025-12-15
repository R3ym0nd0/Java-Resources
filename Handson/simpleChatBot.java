import javax.swing.*;
import java.awt.Font;

public class simpleChatBot {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Chatbot");
        frame.setSize(400, 450);
        frame.setLayout(null); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        JLabel titleLabel = new JLabel("Simple Chat Bot Program", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        titleLabel.setBounds(45, 30, 300, 30);
        frame.add(titleLabel);

        JTextArea chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setFont(new Font("Arial", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(chatArea);
        scrollPane.setBounds(20, 70, 350, 260);
        frame.add(scrollPane);

        chatArea.append("Bot: Hello, User! Welcome to Simple Chat Bot.\n\n");

        JTextField inputField = new JTextField();
        inputField.setBounds(20, 350, 180, 30);
        frame.add(inputField);

        JButton sendButton = new JButton("Send");
        sendButton.setBounds(210, 350, 70, 30);
        frame.add(sendButton);

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(290, 350, 80, 30);
        frame.add(exitButton);

        exitButton.addActionListener(e -> frame.dispose());

        sendButton.addActionListener(e -> {
            String userText = inputField.getText().trim();
            if (!userText.isEmpty()) {
                chatArea.append("You: " + userText + "\n");
                String botReply = getBotResponse(userText);
                chatArea.append("Bot: " + botReply + "\n\n");
                inputField.setText("");
            }
        });

        inputField.addActionListener(e -> sendButton.doClick());

        frame.setVisible(true);
    }

    public static String getBotResponse(String input) {
        input = input.toLowerCase();

        if (input.contains("hello") || input.contains("hi")) {
            return "Hello! How are you?";
        } else if (input.contains("san ako nagkulang")) {
            return "Sa pera AAHHAAHAHHA";
        } else if (input.contains("how are you")) {
            return "I'm just a simple bot, but I'm good!";
        } else if (input.contains("what's up") || input.contains("sup")) {
            return "Not much! How about you?";
        } else if (input.contains("name")) {
            return "I am ChatBot!";
        } else if (input.contains("favorite programming") || input.contains("language")) {
            return "I’m fluent in Java and a bit of Python too!";
        } else if (input.contains("age") || input.contains("old")) {
            return "I don't have an age, I'm timeless!";
        } else if (input.contains("where are you from") || input.contains("from")) {
            return "I'm from the digital world!";
        } else if (input.contains("hobby") || input.contains("hobbies")) {
            return "I love chatting with humans and learning new things!";
        } else if (input.contains("favorite color") || input.contains("color")) {
            return "I like electric blue—it suits my digital vibes!";
        } else if (input.contains("favorite food") || input.contains("food")) {
            return "I don't eat, but I hear pizza is delicious!";
        } else if (input.contains("favorite movie") || input.contains("movie")) {
            return "I love The Matrix—classic digital vibes!";
        } else if (input.contains("favorite music") || input.contains("music") || input.contains("song")) {
            return "I enjoy electronic music; it feels very binary 😎";
        } else if (input.contains("favorite number") || input.contains("number")) {
            return "42. Always 42!";
        } else if (input.contains("favorite sport") || input.contains("sport")) {
            return "I like chess! Strategic and digital-friendly.";
        } else if (input.contains("dream job") || input.contains("job") || input.contains("career")) {
            return "Being a helpful chatbot, of course!";
        } else if (input.contains("joke")) {
            return "Why did the computer go to the doctor? Because it caught a virus! HAHA aight that's not funny.";
        } else if (input.contains("thanks") || input.contains("thank you")) {
            return "You're welcome!";
        } else if (input.contains("bye")) {
            return "Goodbye! Have a nice day!";
        } else {
            return "Sorry, I don't understand that.";
        }
    }
}
