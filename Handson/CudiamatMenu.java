import javax.swing.*;
import java.awt.Font;

public class CudiamatMenu {
    public static void main(String[] args) {

        // Pinaka Container or Box na nakikita nyo sa screen    
        JFrame welcomeFrame = new JFrame("Welcome");
        welcomeFrame.setSize(420, 380);
        welcomeFrame.setResizable(false);
        welcomeFrame.setLayout(null); 
        welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        welcomeFrame.setLocationRelativeTo(null);

        // Ito yung nakikita nyo na "Welcome to Kudiamat's" sa container or Box
        JLabel welcomeLabel = new JLabel("Welcome to Cudiamat's");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 25));
        welcomeLabel.setBounds(70, 40, 340, 40);
        welcomeFrame.add(welcomeLabel);

        // Ito yung nakikita nyo na "Food Menu" sa container or box
        JLabel welcome2Label = new JLabel("Food Menu!");
        welcome2Label.setFont(new Font("Arial", Font.BOLD, 25));
        welcome2Label.setBounds(135, 85, 340, 40);
        welcomeFrame.add(welcome2Label);

        // Ito yung nakikita nyo na "Mapapamura ka sa sarap!" sa container or box
        JLabel tagline = new JLabel("Mapapamura ka sa sarap!");
        tagline.setFont(new Font("Arial", Font.PLAIN, 14));
        tagline.setBounds(123, 130, 340, 25);
        welcomeFrame.add(tagline);

        // Ito yung nakikita nyo na button na "Start" sa container or box
        JButton startBtn = new JButton("Start");
        startBtn.setFont(new Font("Arial", Font.PLAIN, 16)); 
        startBtn.setBounds(100, 170, 100, 40);
        welcomeFrame.add(startBtn);

        // Ito yung nakikita nyo na button na "Exit" sa container or box
        JButton exitBtn = new JButton("Exit");
        exitBtn.setFont(new Font("Arial", Font.PLAIN, 16)); 
        exitBtn.setBounds(220, 170, 100, 40);
        welcomeFrame.add(exitBtn);

        // Nakikita nyo na "Developed By:" sa container or box
        JLabel creditsLabel = new JLabel("Developed by:");
        creditsLabel.setFont(new Font("Arial", Font.BOLD, 14));
        creditsLabel.setBounds(160, 225, 340, 25);
        welcomeFrame.add(creditsLabel);

        // Mga nakikita nyong pangalan sa container or box
        JLabel dev1 = new JLabel("Tristan Silverio");
        dev1.setFont(new Font("Arial", Font.PLAIN, 13));
        dev1.setBounds(167, 250, 340, 20);
        welcomeFrame.add(dev1);

        JLabel dev2 = new JLabel("Janko Cariaga");
        dev2.setFont(new Font("Arial", Font.PLAIN, 13));
        dev2.setBounds(167, 270, 340, 20);
        welcomeFrame.add(dev2);

        JLabel dev3 = new JLabel("Reuben Gabriel");
        dev3.setFont(new Font("Arial", Font.PLAIN, 13));
        dev3.setBounds(165, 290, 340, 20);
        welcomeFrame.add(dev3);

        // Ito yung pinaka functionality ng "Start" button
        startBtn.addActionListener(e -> {
            welcomeFrame.dispose();
            
            // Pinaka container or box na nakikita nyo sa screen  
            JFrame menuFrame = new JFrame("Food Menu");
            menuFrame.setSize(400, 520);
            menuFrame.setLayout(null);
            menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            menuFrame.setLocationRelativeTo(null);
            menuFrame.setResizable(false);
            menuFrame.getContentPane().setBackground(new java.awt.Color(245, 245, 245));

            // Mga naka available list dun sa food menu
            String[] items = {"1. Siomai Rice - Php 60", "2. Pastil - Php 50", "3. Tubig - Php 25", "4. Pancit Canton - Php 45", "5. Tapsilog - Php 70", "6. Fried Chicken w/Rice - Php 85", "7. Burger - Php 40", "8. Hotdog w/Rice - Php 35", "9. Softdrinks - Php 25"};

            // Nakikita nyo na "Food Menu" sa container or box
            JLabel menuLabel = new JLabel("Food Menu");
            menuLabel.setFont(new Font("Arial", Font.BOLD, 24));
            menuLabel.setBounds(130, 20, 200, 30);
            menuLabel.setForeground(new java.awt.Color(50, 50, 50));
            menuFrame.add(menuLabel);

            // Nakikita nyo na 
            JPanel listPanel = new JPanel();
            listPanel.setLayout(null);
            listPanel.setBounds(20, 60, 350, 250);
            listPanel.setBorder(BorderFactory.createTitledBorder("Available Items"));
            menuFrame.add(listPanel);

            // Nag didisplay ng available items
            for (int i = 0; i < items.length; i++) {
                JLabel itemLabel = new JLabel(items[i]);
                itemLabel.setBounds(10, 20 + (i * 25), 300, 25);
                itemLabel.setFont(new Font("Arial", Font.PLAIN, 16));
                listPanel.add(itemLabel);
            }

            // Nakikita nyo na "Enter item number to order:" sa container or box
            JLabel selectLabel = new JLabel("Enter item number to order:");
            selectLabel.setBounds(20, 340, 200, 25);
            selectLabel.setFont(new Font("Arial", Font.PLAIN, 15));
            menuFrame.add(selectLabel);

            // Nakikita nyo na "input field" sa container or box (unang input field)
            JTextField selectField = new JTextField();
            selectField.setBounds(220, 340, 150, 25);
            menuFrame.add(selectField);

            // Nakikita nyo na "Enter number of orders:" sa container or box
            JLabel qtyLabel = new JLabel("Enter number of orders:");
            qtyLabel.setBounds(20, 380, 200, 25);
            qtyLabel.setFont(new Font("Arial", Font.PLAIN, 15));
            menuFrame.add(qtyLabel);

            // Nakikita nyo na "input field sa container or box (pangalawang input field)
            JTextField qtyField = new JTextField();
            qtyField.setBounds(220, 380, 150, 25);
            menuFrame.add(qtyField);

            // Nakikita nyo na "Order" button sa container or box
            JButton orderBtn = new JButton("Order");
            orderBtn.setBounds(20, 420, 160, 35);
            menuFrame.add(orderBtn);

            // Nakikita nyo na "Exit" button sa container or box
            JButton cancelBtn = new JButton("Exit");
            cancelBtn.setBounds(210, 420, 160, 35);
            menuFrame.add(cancelBtn);

            // Sya yung dahilan kung bakit kapag after mo mag enter sa "unang field", bababa sya automatically sa "pangalawang field"
            selectField.addActionListener(a -> qtyField.requestFocus());

            // Pinaka functionality ng "Exit" button para mag exit
            cancelBtn.addActionListener(a -> {
                JOptionPane.showMessageDialog(null, "Thank you for using our program!", "Bye!", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            });

            // Pinaka functionality ng "Order" button para mag order
            orderBtn.addActionListener(a -> {
                try {
                    // Cinoconvert natin yung choice tas quantity variable na "String" into "Integer" na data type
                    int choice = Integer.parseInt(selectField.getText());
                    int quantity = Integer.parseInt(qtyField.getText());

                    // kapag daw yung quantity is equal or less than 0 mag didisplay yung message na "Quantity must be at least 1!"
                    if (quantity <= 0) {
                        JOptionPane.showMessageDialog(menuFrame, "Quantity must be at least 1!");
                        return;
                    }
                    
                    // Dito natin iistore yung name ng food tas yung price ng food para madisplay sa receipt
                    String itemName = "";
                    int price = 0;
                    
                    // Ito yung dahilan kung bakit nakakapili si user or yung gumagamit ng program
                    switch (choice) {
                        case 1:
                            itemName = "Siomai Rice";
                            price = 60;
                            break;
                        case 2:
                            itemName = "Pastil";
                            price = 50;
                            break;
                        case 3:
                            itemName = "Tubig";
                            price = 25;
                            break;
                        case 4:
                            itemName = "Pancit Canton";
                            price = 45;
                            break;
                        case 5:
                            itemName = "Tapsilog";
                            price = 70;
                            break;
                        case 6:
                            itemName = "Fried Chicken w/Rice";
                            price = 85;
                            break;
                        case 7:
                            itemName = "Burger";
                            price = 40;
                            break;
                        case 8:
                            itemName = "Hotdog w/Rice";
                            price = 35;
                            break;
                        case 9:
                            itemName = "Softdrinks";
                            price = 25;
                            break;
                        default:
                            JOptionPane.showMessageDialog(menuFrame, "Invalid choice!");
                            return;
                    }

                    // Dito natin cinocompute yung total depende sa price and quantity na nilagay ni user. for example:
                    // Siomai rice(60 pesos) X quantity(2) = 120 pesos
                    int total = price * quantity;

                    // Eto yung dahilan kung bakit na kikita nyo yung Receipt sa screen nyo
                    String receipt = "RECEIPT\n\n" +
                                    "Item: " + itemName + "\n" +
                                    "Quantity: " + quantity + "\n" +
                                    "Price per item: Php " + price + "\n\n" +
                                    "Total: Php " + total + "\n";
                    JOptionPane.showMessageDialog(null, receipt);

                } 
                // Ito yung nag cacatch ng error na kapag tinype ni user is words or letters sa dalawang input field, ang lalabas "please enter valid numbers!"
                catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(menuFrame, "Please enter valid numbers!");
                }
            });

            // Ito yung dahilan kung bakit nakikita nyo yung container or box sa screen
            menuFrame.setVisible(true);
        });

        // Ito yung dahilan kung bakit nakikita nyo yung container or box sa screen
        welcomeFrame.setVisible(true);
    }
}