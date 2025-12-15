import javax.swing.*;
import java.awt.Font;

public class loadSystem {

    public static void main(String[] args) {

        final int[] userBalance = {0};
        final String[] mobileNumber = {""};
        final String[] selectedLoadDesc = {""};
        final int[] selectedLoadPrice = {0};

        JFrame introFrame = new JFrame("Load System");
        introFrame.setSize(400, 350);
        introFrame.setLayout(null);
        introFrame.setResizable(false);
        introFrame.setLocationRelativeTo(null);
        introFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel welcomeLabel = new JLabel("Welcome to");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 23));
        welcomeLabel.setBounds(80, 40, 200, 30);

        JLabel titleLabel = new JLabel("LOAD SYSTEM");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 23));
        titleLabel.setBounds(140, 70, 200, 30);

        JLabel tagline = new JLabel("Load na mura, saya pa sobra!");
        tagline.setFont(new Font("Arial", Font.ITALIC, 12));
        tagline.setBounds(110, 110, 200, 30);

        JLabel balLabel = new JLabel("Enter Balance (10 MIN - 50,000 MAX)");
        balLabel.setBounds(90, 170, 230, 25);

        JTextField balField = new JTextField();
        balField.setBounds(80, 200, 230, 30);

        JButton startBtn = new JButton("Start");
        startBtn.setBounds(80, 240, 100, 30);

        JButton exitBtn = new JButton("Exit");
        exitBtn.setBounds(210, 240, 100, 30);

        introFrame.add(welcomeLabel);
        introFrame.add(titleLabel);
        introFrame.add(tagline);
        introFrame.add(balLabel);
        introFrame.add(balField);
        introFrame.add(startBtn);
        introFrame.add(exitBtn);

        JFrame simFrame = new JFrame("Select SIM");
        simFrame.setSize(400, 350);
        simFrame.setLayout(null);
        simFrame.setResizable(false);
        simFrame.setLocationRelativeTo(null);
        simFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel simLabel = new JLabel("Select SIM");
        simLabel.setFont(new Font("Arial", Font.BOLD, 23));
        simLabel.setBounds(135, 40, 180, 25);

        JButton tntBtn = new JButton("TNT");
        tntBtn.setBounds(60, 80, 120, 40);

        JButton smartBtn = new JButton("SMART");
        smartBtn.setBounds(60, 130, 120, 40);

        JButton globeBtn = new JButton("GLOBE");
        globeBtn.setBounds(200, 80, 120, 40);

        JButton tmBtn = new JButton("TM");
        tmBtn.setBounds(200, 130, 120, 40);

        JLabel numLabel = new JLabel("Enter Mobile Number:");
        numLabel.setBounds(80, 190, 200, 25);

        JTextField numField = new JTextField();
        numField.setBounds(80, 220, 220, 30);

        JButton numCancel = new JButton("Cancel");
        numCancel.setBounds(145, 260, 100, 30);

        simFrame.add(simLabel);
        simFrame.add(tntBtn);
        simFrame.add(smartBtn);
        simFrame.add(globeBtn);
        simFrame.add(tmBtn);
        simFrame.add(numLabel);
        simFrame.add(numField);
        simFrame.add(numCancel);

        tntBtn.setEnabled(false);
        smartBtn.setEnabled(false);
        globeBtn.setEnabled(false);
        tmBtn.setEnabled(false);

        JFrame tntMenuFrame = new JFrame("TNT Load Menu");
        tntMenuFrame.setSize(400, 350);
        tntMenuFrame.setLayout(null);
        tntMenuFrame.setResizable(false);
        tntMenuFrame.setLocationRelativeTo(null);
        tntMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel tntMenuLabel = new JLabel("TNT Loads");
        tntMenuLabel.setFont(new Font("Arial", Font.BOLD, 23));
        tntMenuLabel.setBounds(130, 35, 200, 25);

        JButton tntLoad100 = new JButton("UNLI DATA 100");
        tntLoad100.setBounds(100, 80, 180, 30);

        JButton tntLoad85 = new JButton("UNLI DATA 85");
        tntLoad85.setBounds(100, 120, 180, 30);

        JButton tntLoad50 = new JButton("GIGA VIDEO 50");
        tntLoad50.setBounds(100, 160, 180, 30);

        JButton tntLoad30 = new JButton("GIGA VIDEO 30");
        tntLoad30.setBounds(100, 200, 180, 30);

        JButton cancelTNT = new JButton("Cancel");
        cancelTNT.setBounds(150, 250, 80, 30);

        tntMenuFrame.add(tntMenuLabel);
        tntMenuFrame.add(tntLoad100);
        tntMenuFrame.add(tntLoad85);
        tntMenuFrame.add(tntLoad50);
        tntMenuFrame.add(tntLoad30);
        tntMenuFrame.add(cancelTNT);

        JFrame smartMenuFrame = new JFrame("SMART Load Menu");
        smartMenuFrame.setSize(400, 350);
        smartMenuFrame.setLayout(null);
        smartMenuFrame.setResizable(false);
        smartMenuFrame.setLocationRelativeTo(null);
        smartMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel smartMenuLabel = new JLabel("SMART Loads");
        smartMenuLabel.setFont(new Font("Arial", Font.BOLD, 23));
        smartMenuLabel.setBounds(110, 35, 250, 25);

        JButton smartLoad120 = new JButton("GIGA VIDEO 120");
        smartLoad120.setBounds(100, 120, 180, 30);

        JButton smartLoad75 = new JButton("GIGA POWER 75");
        smartLoad75.setBounds(100, 80, 180, 30);

        JButton smartLoad149 = new JButton("GIGA POWER 149");
        smartLoad149.setBounds(100, 160, 180, 30);

        JButton smartLoad60 = new JButton("GIGA STORIES 60");
        smartLoad60.setBounds(100, 200, 180, 30);

        JButton cancelSMART = new JButton("Cancel");
        cancelSMART.setBounds(150, 250, 80, 30);

        smartMenuFrame.add(smartMenuLabel);
        smartMenuFrame.add(smartLoad120);
        smartMenuFrame.add(smartLoad75);
        smartMenuFrame.add(smartLoad149);
        smartMenuFrame.add(smartLoad60);
        smartMenuFrame.add(cancelSMART);

        JFrame globeMenuFrame = new JFrame("GLOBE Load Menu");
        globeMenuFrame.setSize(400, 350);
        globeMenuFrame.setLayout(null);
        globeMenuFrame.setResizable(false);
        globeMenuFrame.setLocationRelativeTo(null);
        globeMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel globeMenuLabel = new JLabel("GLOBE Loads");
        globeMenuLabel.setFont(new Font("Arial", Font.BOLD, 23));
        globeMenuLabel.setBounds(110, 35, 250, 25);

        JButton globeGo59 = new JButton("Go59");
        globeGo59.setBounds(100, 120, 180, 30);

        JButton globeGo90 = new JButton("Go90");
        globeGo90.setBounds(100, 80, 180, 30);

        JButton globeGoPLUS99 = new JButton("GoPLUS99");
        globeGoPLUS99.setBounds(100, 160, 180, 30);

        JButton globeGoPLUS129 = new JButton("GoPLUS129");
        globeGoPLUS129.setBounds(100, 200, 180, 30);

        JButton cancelGLOBE = new JButton("Cancel");
        cancelGLOBE.setBounds(150, 250, 80, 30);

        globeMenuFrame.add(globeMenuLabel);
        globeMenuFrame.add(globeGo59);
        globeMenuFrame.add(globeGo90);
        globeMenuFrame.add(globeGoPLUS99);
        globeMenuFrame.add(globeGoPLUS129);
        globeMenuFrame.add(cancelGLOBE);

        JFrame tmMenuFrame = new JFrame("TM Load Menu");
        tmMenuFrame.setSize(400, 350);
        tmMenuFrame.setLayout(null);
        tmMenuFrame.setResizable(false);
        tmMenuFrame.setLocationRelativeTo(null);
        tmMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel tmMenuLabel = new JLabel("TM Loads");
        tmMenuLabel.setFont(new Font("Arial", Font.BOLD, 23));
        tmMenuLabel.setBounds(130, 35, 250, 25);

        JButton tmANS20 = new JButton("ANS20");
        tmANS20.setBounds(100, 80, 180, 30);

        JButton tmANS30 = new JButton("ANS30");
        tmANS30.setBounds(100, 120, 180, 30);

        JButton tmANS10 = new JButton("ANS10");
        tmANS10.setBounds(100, 160, 180, 30);

        JButton tmGG30 = new JButton("GG30");
        tmGG30.setBounds(100, 200, 180, 30);

        JButton cancelTM = new JButton("Cancel");
        cancelTM.setBounds(150, 250, 80, 30);

        tmMenuFrame.add(tmMenuLabel);
        tmMenuFrame.add(tmANS20);
        tmMenuFrame.add(tmANS30);
        tmMenuFrame.add(tmANS10);
        tmMenuFrame.add(tmGG30);
        tmMenuFrame.add(cancelTM);

        JFrame confirmFrame = new JFrame("Confirm Load");
        confirmFrame.setSize(400, 350);
        confirmFrame.setLayout(null);
        confirmFrame.setResizable(false);
        confirmFrame.setLocationRelativeTo(null);
        confirmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel desc = new JLabel("Load", JLabel.CENTER);
        desc.setFont(new Font("Arial", Font.BOLD,15));
        desc.setBounds(20,110, 350, 25);

        JButton confirmBtn = new JButton("Confirm");
        confirmBtn.setBounds(80, 150, 100, 30);

        JButton cancelBtn = new JButton("Cancel");
        cancelBtn.setBounds(200, 150, 100, 30);

        confirmFrame.add(desc);
        confirmFrame.add(confirmBtn);
        confirmFrame.add(cancelBtn);

        JFrame successFrame = new JFrame("Success");
        successFrame.setSize(400, 350);
        successFrame.setLayout(null);
        successFrame.setResizable(false);
        successFrame.setLocationRelativeTo(null);
        successFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel successLabel = new JLabel();
        successLabel.setBounds(50, 120, 300, 50);

        JButton backSIMBtn = new JButton("Back to SIM Selection");
        backSIMBtn.setBounds(100, 160, 200, 30);
        backSIMBtn.addActionListener(e -> {
            successFrame.dispose();
            numField.setText("");
            tntBtn.setEnabled(false);
            smartBtn.setEnabled(false);
            globeBtn.setEnabled(false);
            tmBtn.setEnabled(false);
            simFrame.setVisible(true);
        });

        successFrame.add(successLabel);
        successFrame.add(backSIMBtn);

        startBtn.addActionListener(e -> {
            String balText = balField.getText().trim();
            int balance = 0;
            try {
                balance = Integer.parseInt(balText);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(introFrame, "Please enter a valid number for balance!");
                return;
            }
            if (balance < 10 || balance > 50000) {
                JOptionPane.showMessageDialog(introFrame, "Balance must be between 10 and 50,000!");
                return;
            }
            userBalance[0] = balance;
            introFrame.dispose();
            simFrame.setVisible(true);
        });

        numField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                String num = numField.getText().trim();
                boolean valid = num.matches("09\\d{9}");
                tntBtn.setEnabled(valid);
                smartBtn.setEnabled(valid);
                globeBtn.setEnabled(valid);
                tmBtn.setEnabled(valid);
                if(valid) mobileNumber[0] = num;
            }
        });

        tntBtn.addActionListener(e -> {
            simFrame.dispose();
            tntMenuFrame.setVisible(true);
        });

        smartBtn.addActionListener(e -> {
            simFrame.dispose();
            smartMenuFrame.setVisible(true);
        });

        globeBtn.addActionListener(e -> {
            simFrame.dispose();
            globeMenuFrame.setVisible(true);
        });

        tmBtn.addActionListener(e -> {
            simFrame.dispose();
            tmMenuFrame.setVisible(true);
        });

        tntLoad100.addActionListener(e -> selectLoad("UNLI DATA 100 - 7 Days", 100, desc, tntMenuFrame, confirmFrame, selectedLoadDesc, selectedLoadPrice));
        tntLoad85.addActionListener(e -> selectLoad("UNLI DATA 85 - 7 Days", 85, desc, tntMenuFrame, confirmFrame, selectedLoadDesc, selectedLoadPrice));
        tntLoad50.addActionListener(e -> selectLoad("GIGA VIDEO 50 - 3 Days", 50, desc, tntMenuFrame, confirmFrame, selectedLoadDesc, selectedLoadPrice));
        tntLoad30.addActionListener(e -> selectLoad("GIGA VIDEO 30 - 3 Days", 30, desc, tntMenuFrame, confirmFrame, selectedLoadDesc, selectedLoadPrice));

        cancelTNT.addActionListener(e -> {
            tntMenuFrame.dispose();
            simFrame.setVisible(true);
        });

        smartLoad120.addActionListener(e -> selectLoad("GIGA VIDEO 120 - 3 Days", 120, desc, smartMenuFrame, confirmFrame, selectedLoadDesc, selectedLoadPrice));
        smartLoad75.addActionListener(e -> selectLoad("GIGA POWER 75 - 7 Days", 75, desc, smartMenuFrame, confirmFrame, selectedLoadDesc, selectedLoadPrice));
        smartLoad149.addActionListener(e -> selectLoad("GIGA POWER 149 - 7 Days", 149, desc, smartMenuFrame, confirmFrame, selectedLoadDesc, selectedLoadPrice));
        smartLoad60.addActionListener(e -> selectLoad("GIGA STORIES 60 - 7 Days", 60, desc, smartMenuFrame, confirmFrame, selectedLoadDesc, selectedLoadPrice));

        cancelSMART.addActionListener(e -> {
            smartMenuFrame.dispose();
            simFrame.setVisible(true);
        });

        globeGo59.addActionListener(e -> selectLoad("Go59", 59, desc, globeMenuFrame, confirmFrame, selectedLoadDesc, selectedLoadPrice));
        globeGo90.addActionListener(e -> selectLoad("Go90", 90, desc, globeMenuFrame, confirmFrame, selectedLoadDesc, selectedLoadPrice));
        globeGoPLUS99.addActionListener(e -> selectLoad("GoPLUS99", 99, desc, globeMenuFrame, confirmFrame, selectedLoadDesc, selectedLoadPrice));
        globeGoPLUS129.addActionListener(e -> selectLoad("GoPLUS129", 129, desc, globeMenuFrame, confirmFrame, selectedLoadDesc, selectedLoadPrice));

        cancelGLOBE.addActionListener(e -> {
            globeMenuFrame.dispose();
            simFrame.setVisible(true);
        });

        tmANS20.addActionListener(e ->
        selectLoad("ALL-NET SURF 20 (ANS20)", 20, desc, tmMenuFrame, confirmFrame, selectedLoadDesc, selectedLoadPrice));

        tmANS30.addActionListener(e ->
                selectLoad("ALL-NET SURF 30 (ANS30)", 30, desc, tmMenuFrame, confirmFrame, selectedLoadDesc, selectedLoadPrice));

        tmANS10.addActionListener(e ->
                selectLoad("ALL-NET SURF 10 (ANS10)", 10, desc, tmMenuFrame, confirmFrame, selectedLoadDesc, selectedLoadPrice));

        tmGG30.addActionListener(e ->
                selectLoad("GG30", 30, desc, tmMenuFrame, confirmFrame, selectedLoadDesc, selectedLoadPrice));

        cancelTM.addActionListener(e -> {
            tmMenuFrame.dispose();
            simFrame.setVisible(true);
        });

        confirmBtn.addActionListener(e -> {
            if(userBalance[0] < selectedLoadPrice[0]){
                JOptionPane.showMessageDialog(confirmFrame, "Insufficient balance!");
                return;
            }
            userBalance[0] -= selectedLoadPrice[0];

            JOptionPane.showMessageDialog(confirmFrame,
                    "SUCCESSFULLY LOADED!\n\nMobile Number: " + numField.getText() + "\nSelected Load Price: " + selectedLoadPrice[0] + "\nRemaining Balance: Php " + userBalance[0],
                    "Success", JOptionPane.INFORMATION_MESSAGE);

            confirmFrame.dispose();
            numField.setText("");
            tntBtn.setEnabled(false);
            smartBtn.setEnabled(false);
            globeBtn.setEnabled(false);
            tmBtn.setEnabled(false);
            simFrame.setVisible(true);
        });

        cancelBtn.addActionListener(e -> {
            confirmFrame.dispose();
            tntMenuFrame.setVisible(true);
            smartMenuFrame.setVisible(true);
        });

        numCancel.addActionListener(e -> {
            simFrame.dispose();
            introFrame.setVisible(true);
        });

        exitBtn.addActionListener(e -> System.exit(0));

        introFrame.setVisible(true);
    }

    public static void selectLoad(String descText, int price, JLabel desc, JFrame menuFrame, JFrame confirmFrame,
                                  String[] selectedLoadDesc, int[] selectedLoadPrice) {
        selectedLoadDesc[0] = descText;
        selectedLoadPrice[0] = price;
        desc.setText(descText + " - Price: Php " + price);
        menuFrame.dispose();
        confirmFrame.setVisible(true);
    }
}