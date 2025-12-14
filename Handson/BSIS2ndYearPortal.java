package practice;
import javax.swing.*;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;

public class BSIS2ndYearPortal {
    public static void main(String[] args) {
        showWelcome();
    }

    public static void showWelcome() {
        JFrame frame = new JFrame("BSIS Student Portal");
        frame.setSize(400, 400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel title = new JLabel("Welcome to BSIS 2Y Portal");
        title.setBounds(45, 50, 400, 20);
        title.setFont(new Font("Arial", Font.BOLD, 23));
        frame.add(title);

        JLabel title2 = new JLabel("Program");
        title2.setBounds(145, 85, 400, 25);
        title2.setFont(new Font("Arial", Font.BOLD, 23));
        frame.add(title2);

        JLabel creditsLabel = new JLabel("Developed by:");
        creditsLabel.setFont(new Font("Arial", Font.BOLD, 14));
        creditsLabel.setBounds(143, 130, 340, 25);
        frame.add(creditsLabel);

        JLabel dev1 = new JLabel("Hans Malbago");
        dev1.setFont(new Font("Arial", Font.PLAIN, 13));
        dev1.setBounds(150, 160, 340, 20);
        frame.add(dev1);

        JLabel dev2 = new JLabel("Leo Dorado");
        dev2.setFont(new Font("Arial", Font.PLAIN, 13));
        dev2.setBounds(158, 180, 340, 20);
        frame.add(dev2);

        JLabel dev3 = new JLabel("Luis Hernandez");
        dev3.setFont(new Font("Arial", Font.PLAIN, 13));
        dev3.setBounds(148, 200, 340, 20);
        frame.add(dev3);

        JLabel dev4 = new JLabel("Mark John Emor");
        dev4.setFont(new Font("Arial", Font.PLAIN, 13));
        dev4.setBounds(148, 220, 340, 20);
        frame.add(dev4);

        JLabel dev5 = new JLabel("Reymond Joaquin");
        dev5.setFont(new Font("Arial", Font.PLAIN, 13));
        dev5.setBounds(143, 240, 340, 20);
        frame.add(dev5);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(60, 280, 130, 35);
        frame.add(loginButton);

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(200, 280, 130, 35);
        frame.add(registerButton);

        loginButton.addActionListener(e -> {    
            frame.dispose();;
            Login.authenticate(); 
        });

        registerButton.addActionListener(e -> { 
            frame.dispose();
            Registration.register(); 
        });

        frame.setVisible(true);
    }

}

class Registration {
    private static String regPassword;
    private static String regfirstName;
    private static String reglastName;
    private static int regAge;
    private static int regIDNumber;
    private static double regBalance;
    public static boolean isTuitionpaid = false;

    public static void register() {
        JFrame frame = new JFrame("BSIS Student Portal Register");
        frame.setSize(400, 550);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel loginTitle = new JLabel("Portal Register");
        loginTitle.setBounds(120, 30, 400, 25);
        loginTitle.setFont(new Font("Arial", Font.BOLD, 23));
        frame.add(loginTitle);

        JTextField firstName = firstName(frame);
        JTextField lastName = lastName(frame);
        JTextField stringAge = age(frame);
        JTextField stringBalance = balance(frame);
        JTextField stringIdNum = IDNumber(frame);
        JTextField password = password(frame);
        

        JButton button = new JButton("Register");
        button.setBounds(100, 450, 90, 30);
        frame.add(button);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(208, 450, 90, 30);
        frame.add(cancelButton);

        firstName.addActionListener(e -> lastName.requestFocus());
        lastName.addActionListener(e -> stringAge.requestFocus());
        stringAge.addActionListener(e -> stringBalance.requestFocus());
        stringBalance.addActionListener(e -> stringIdNum.requestFocus());
        stringIdNum.addActionListener(e -> password.requestFocus());

        button.addActionListener(e -> {
            regfirstName = firstName.getText().trim();
            reglastName  = lastName.getText().trim();
            regPassword  = password.getText().trim();

            if (regfirstName.isEmpty() || reglastName.isEmpty() || regPassword.isEmpty()) {
                JOptionPane.showMessageDialog(null, "All fields are required");
                return;
            }

            try {
                regAge = Integer.parseInt(stringAge.getText().trim());
                regBalance = Integer.parseInt(stringBalance.getText().trim());
                regIDNumber = Integer.parseInt(stringIdNum.getText().trim());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid number input");
                return;
            }

            if (regAge < 1 || regAge > 120) {
                JOptionPane.showMessageDialog(null, "Age must be between 1 and 120");
                return;
            }

            if (regBalance < 2575 || regBalance > 20000) {
                JOptionPane.showMessageDialog(null, "Balance must be between 2575 and 20000");
                return;
            }

            if (regIDNumber <= 0) {
                JOptionPane.showMessageDialog(null, "ID Number must be a positive number");
                return;
            }

            JOptionPane.showMessageDialog(null, "You Complete Registration!");
            frame.dispose();
            BSIS2ndYearPortal.showWelcome();
        });
        
        cancelButton.addActionListener(e -> {
            frame.dispose();
            BSIS2ndYearPortal.showWelcome();
        });
           
        frame.setVisible(true);
    }

    public static void studentInfo() {
        JFrame frame = new JFrame("Student Information");
        frame.setSize(500, 450);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title = new JLabel("STUDENT INFORMATION");
        title.setBounds(130, 40, 400, 20);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(title);

        JLabel nameLabel = new JLabel("Full Name: " + firstNameStored() + " " + lastNameStored());
        nameLabel.setBounds(20, 70, 450, 25);
        frame.add(nameLabel);

        JLabel ageLabel = new JLabel("Age: " + ageStored());
        ageLabel.setBounds(20, 90, 200, 25);
        frame.add(ageLabel);

        JLabel gradeLabel = new JLabel("Grade: 2nd Year");
        gradeLabel.setBounds(20, 110, 300, 25);
        frame.add(gradeLabel);

        JLabel idLabel = new JLabel("ID Number: " + IDNumberStored());
        idLabel.setBounds(20, 130, 200, 25);
        frame.add(idLabel);

        JLabel balanceLabel = new JLabel("Balance: PHP" + balanceStored());
        balanceLabel.setBounds(20, 150, 200, 25);
        frame.add(balanceLabel);

        JLabel scheduleLabel = new JLabel("Schedule:");
        scheduleLabel.setBounds(20, 170, 200, 25);
        frame.add(scheduleLabel);

        String[] columnNames = {"Day", "Subject", "Units"};
        String[][] data = {
            {"Monday", "OOP and Network Infra.", "3.00"},
            {"Tuesday", "Data Structure", "3.00"},
            {"Wednesday", "Free Day", "0.00"},
            {"Thursday", "Free Day", "0.00"},
            {"Friday", "Org. and Management", "3.00"},
            {"Saturday", "Minor Subject", "0.00"},
            {"Sunday", "Free Day", "0.00"}
        };

        JTable table = new JTable(data, columnNames);
        table.setEnabled(false);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 200, 450, 135);
        frame.add(scrollPane);

        JButton closeBtn = new JButton("Close");
        closeBtn.setBounds(190, 350, 100, 25);
        closeBtn.addActionListener(e -> {
            frame.dispose();
            Menu.choices();
        });
        frame.add(closeBtn);

        frame.setVisible(true);
    }

    private static JTextField firstName(JFrame frame) {
        JLabel firstNameLabel = new JLabel("Enter First Name");
        firstNameLabel.setBounds(100, 70, 120, 25);
        frame.add(firstNameLabel);

        JTextField firstName = new JTextField();
        firstName.setBounds(100, 100, 200, 30);
        frame.add(firstName);

        return firstName;
    }

    private static JTextField lastName(JFrame frame) {
        JLabel lastNameLabel = new JLabel("Enter Last Name");
        lastNameLabel.setBounds(100, 130, 120, 25);
        frame.add(lastNameLabel);

        JTextField lastName = new JTextField();
        lastName.setBounds(100, 160, 200, 30);
        frame.add(lastName);

        return lastName;
    }

    private static JTextField age(JFrame frame) {
        JLabel ageLabel = new JLabel("Enter Age");
        ageLabel.setBounds(100, 190, 120, 25);
        frame.add(ageLabel);

        JTextField ageField = new JTextField();
        ageField.setBounds(100, 220, 200, 30);
        frame.add(ageField);

        return ageField;
    }

    private static JTextField balance(JFrame frame) {
        JLabel balanceLabel = new JLabel("Enter Balance (20,000 PHP max)");
        balanceLabel.setBounds(100, 250, 200, 25);
        frame.add(balanceLabel);

        JTextField balanceField = new JTextField();
        balanceField.setBounds(100, 280, 200, 30);
        frame.add(balanceField);

        return balanceField;
    }

    private static JTextField IDNumber(JFrame frame) {
        JLabel idNumLabel = new JLabel("Enter ID Number");
        idNumLabel.setBounds(100, 310, 120, 25);
        frame.add(idNumLabel);

        JTextField idNumField = new JTextField();
        idNumField.setBounds(100, 340, 200, 30);
        frame.add(idNumField);

        return idNumField;
    }

    public static JPasswordField password(JFrame frame) {
        JLabel passwordLabel = new JLabel("Enter Password");
        passwordLabel.setBounds(100, 370, 120, 25);
        frame.add(passwordLabel);

        JPasswordField paswordField = new JPasswordField();
        paswordField.setBounds(100, 400, 200, 30);
        frame.add(paswordField);

        return paswordField;
    }

    public static String passwordStored() {
        return regPassword;
    }

    public static String firstNameStored() {
        return regfirstName;
    }

    public static String lastNameStored() {
        return reglastName;
    }

    public static double balanceStored() {
        return regBalance;
    }

    public static void newBalance(double newBalance) {
        regBalance = newBalance;
    }

    public static int ageStored() {
        return regAge;
    }

    public static int IDNumberStored() {
        return regIDNumber;
    }

    public static boolean isUserPaid() {
       return isTuitionpaid;
    }
}

class Login {
    private static int attempt = 0;
    private static final int MAX_ATTEMPTS = 5;

    private static JTextField getIDNumber(JFrame frame) {
        JLabel idNumLabel = new JLabel("Enter ID Number");
        idNumLabel.setBounds(100, 70, 100, 25);
        frame.add(idNumLabel);

        JTextField idNumField = new JTextField();
        idNumField.setBounds(100, 100, 200, 30);
        frame.add(idNumField);

        return idNumField;
    }

    private static JPasswordField getPassword(JFrame frame) {
        JLabel idNumLabel = new JLabel("Enter Password");
        idNumLabel.setBounds(100, 130, 120, 25);
        frame.add(idNumLabel);

        JPasswordField idNumField = new JPasswordField();
        idNumField.setBounds(100, 160, 200, 30);
        frame.add(idNumField);

        return idNumField;
    }

    public static void authenticate() {
        JFrame frame = new JFrame("BSIS Student Portal Login");
        frame.setSize(400, 300);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel loginTitle = new JLabel("Portal Login");
        loginTitle.setBounds(133, 30, 400, 25);
        loginTitle.setFont(new Font("Arial", Font.BOLD, 23));
        frame.add(loginTitle);

        JTextField idNumber = getIDNumber(frame);
        JPasswordField password = getPassword(frame);

        int registerIDNumber = Registration.IDNumberStored();
        String registerPassword = Registration.passwordStored();

        JButton button = new JButton("Login");
        button.setBounds(110, 210, 80, 30);
        frame.add(button);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(205, 210, 80, 30);
        frame.add(cancelButton);

        button.addActionListener(e -> {
            String id = idNumber.getText().trim();
            String stringPass = new String(password.getPassword());

            if (id.trim().isEmpty() || stringPass.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Field cannot be empty", "Field Empty", JOptionPane.ERROR_MESSAGE);
                return; 
            }

            int  intId;
            try {
                intId = Integer.parseInt(id.trim());

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "ID number must be numeric!", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if(intId < 1 || intId > 2147483647) {
                JOptionPane.showMessageDialog(null, "Please Enter a Realistic ID Number", "Error", JOptionPane.ERROR_MESSAGE);
            }

            if ((intId == registerIDNumber) && stringPass.equals(registerPassword)){
                JOptionPane.showMessageDialog(null, "Login Successfull", "Login Success", JOptionPane.INFORMATION_MESSAGE);
                attempt = 0;
                frame.dispose();
                Menu.choices();
            } else {
                attempt++;
                if (attempt >= MAX_ATTEMPTS) {
                    JOptionPane.showMessageDialog(null, "Maximum attempts reached! Account locked.", "Locked", JOptionPane.ERROR_MESSAGE);
                    System.exit(0); 
                } else {
                    JOptionPane.showMessageDialog(null, "Login Failed! Attempt " + attempt + " of " + MAX_ATTEMPTS, "Login Failed", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        cancelButton.addActionListener(e -> {
            frame.dispose();
            BSIS2ndYearPortal.showWelcome();
        });

        idNumber.addActionListener(e -> {
            password.requestFocusInWindow();
        });
        
        frame.setVisible(true);
    }
}

class Menu {

    private static double regOOPGrade;
    private static double regDataStructureGrade;
    private static double regNetworkInfrastructureGrade;
    private static double regOrganizationAndManagementGrade;

    public static void choices() {
        
    JFrame frame = new JFrame("BSIS 2Y Portal Menu");
    frame.setSize(400, 350);
    frame.setResizable(false);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);

    JLabel title = new JLabel("PORTAL MENU");
    title.setBounds(115, 20, 250, 30);
    title.setFont(new Font("Arial", Font.BOLD, 23));
    frame.add(title);

    JButton subjectExamBtn = new JButton("Subject Exams");
    subjectExamBtn.setBounds(100, 70, 200, 35);
    frame.add(subjectExamBtn);

    JButton studentGradeBtn = new JButton("Student Grades");
    studentGradeBtn.setBounds(100, 115, 200, 35);
    frame.add(studentGradeBtn);

    JButton studentInfoBtn = new JButton("Student Information");
    studentInfoBtn.setBounds(100, 160, 200, 35);
    frame.add(studentInfoBtn);

    JButton tuitionBtn = new JButton("Tuition Fee Payment");
    tuitionBtn.setBounds(100, 205, 200, 35);
    frame.add(tuitionBtn);

    JButton exitBtn = new JButton("Logout");
    exitBtn.setBounds(100, 250, 200, 30);
    frame.add(exitBtn);

    subjectExamBtn.addActionListener(e -> {
        if (!Registration.isUserPaid()) {
            JOptionPane.showMessageDialog(frame, "Please pay your tuition fee before taking the exam.", "Tuition Fee Required", JOptionPane.ERROR_MESSAGE);
        } else {
            frame.dispose();
            QuizProgram();
        }
    });

    studentGradeBtn.addActionListener(e -> {
        frame.dispose();
        gradeCalculation.subjectGrades();
    });

    studentInfoBtn.addActionListener(e -> {
        frame.dispose();
        Registration.studentInfo();
    });

    tuitionBtn.addActionListener(e -> {
        frame.dispose();
        Tuition.displayTuition();
    });

    exitBtn.addActionListener(e -> {
        frame.dispose();
        BSIS2ndYearPortal.showWelcome();
    });

    frame.setVisible(true);
    }

    private static void QuizProgram() {

        JFrame frame = new JFrame("Subject Exams");
        frame.setSize(400, 350);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel instructionLabel = new JLabel("SUBJECT EXAMS");
        instructionLabel.setFont(new Font("Arial", Font.BOLD, 23));
        instructionLabel.setBounds(100, 20, 300, 25);
        frame.add(instructionLabel);

        JButton oopBtn = new JButton("OOP");
        oopBtn.setBounds(100, 70, 200, 35);
        frame.add(oopBtn);

        JButton dsBtn = new JButton("Data Structure");
        dsBtn.setBounds(100, 115, 200, 35);
        frame.add(dsBtn);

        JButton niBtn = new JButton("Network Infrastructure");
        niBtn.setBounds(100, 160, 200, 35);
        frame.add(niBtn);

        JButton omBtn = new JButton("Org. and Management");
        omBtn.setBounds(100, 205, 200, 35);
        frame.add(omBtn);

        JButton cancelBtn = new JButton("Cancel");
        cancelBtn.setBounds(100, 250, 200, 35);
        frame.add(cancelBtn);

        oopBtn.addActionListener(e -> {
            frame.dispose();
            if (regOOPGrade != 0) {
                JOptionPane.showMessageDialog(frame, "You have already taken the OOP exam.", "Exam Already Taken", JOptionPane.ERROR_MESSAGE);
                Menu.QuizProgram();
            } else {
                regOOPGrade = oopQuiz();
                Menu.QuizProgram();
            }
        });

        dsBtn.addActionListener(e -> {
            frame.dispose();
            if (regDataStructureGrade != 0) {
                JOptionPane.showMessageDialog(frame, "You have already taken the Data Structure exam.", "Exam Already Taken", JOptionPane.ERROR_MESSAGE);
                Menu.QuizProgram();
            } else {
                regDataStructureGrade = dataStructure();
                Menu.QuizProgram();
            }
        });

        niBtn.addActionListener(e -> {
            frame.dispose();
            if (regNetworkInfrastructureGrade != 0) {
                JOptionPane.showMessageDialog(frame, "You have already taken the Network Infrastructure exam.", "Exam Already Taken", JOptionPane.ERROR_MESSAGE);
                Menu.QuizProgram();
            } else {
                regNetworkInfrastructureGrade = networkInfrastructure();
                Menu.QuizProgram();
            }
        });

        omBtn.addActionListener(e -> {
            frame.dispose();
            if (regOrganizationAndManagementGrade != 0) {
                JOptionPane.showMessageDialog(frame, "You have already taken the Organization and Management exam.", "Exam Already Taken", JOptionPane.ERROR_MESSAGE);
                Menu.QuizProgram();
            } else {
                regOrganizationAndManagementGrade = organizationAndManagement();
                Menu.QuizProgram();
            }
        });

        cancelBtn.addActionListener(e -> {
            frame.dispose();
            Menu.choices();
        });

        frame.setVisible(true);
    }

    public static double oopQuiz() {
        String[][] questions = {
            {"1. What does OOP stand for?",
            "A. Object-Oriented Programming",
            "B. Only Object Programming",
            "C. Object-Oriented Process",
            "D. Optioned Object Programming",
            "A"},
            {"2. Which of the following is NOT a principle of OOP?",
                "A. Encapsulation",
                "B. Inheritance",
                "C. Polymorphism",
                "D. Compilation",
                "D"},
            {"3. What blueprint is used to create objects?",
                "A. Class",
                "B. Method",
                "C. Variable",
                "D. Package",
                "A"},
            {"4. Which OOP concept allows a class to inherit properties?",
                "A. Encapsulation",
                "B. Abstraction",
                "C. Inheritance",
                "D. Polymorphism",
                "C"},
            {"5. What is polymorphism in OOP?",
                "A. Inheritance",
                "B. Encapsulation",
                "C. Multiple forms",
                "D. Compilation",
                "C"}
        };

        int networkInfraScore = 0;

        for (int i = 0; i < questions.length; i++) {
            String user_answer = JOptionPane.showInputDialog(null, 
                "Choose the letter of the correct answer:\n\n" +
                questions[i][0] + "\n\n" +
                questions[i][1] + "\n" +
                questions[i][2] + "\n" +
                questions[i][3] + "\n" +
                questions[i][4], 
                "OOP Exam - Question " + (i + 1), 
                JOptionPane.QUESTION_MESSAGE);

            if (user_answer == null) {
                JOptionPane.showMessageDialog(null, 
                    "You cannot exit or cancel while taking the exam.", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                i--;
            }
            else if (user_answer.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, 
                    "Please provide an answer.", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                i--;
            }
            else if (user_answer.trim().length() > 1 || 
                    !"abcd".contains(user_answer.trim().toLowerCase())) {
                JOptionPane.showMessageDialog(null, 
                    "Please enter only a single letter (A, B, C, or D).", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                i--;
            }
            else if (user_answer.trim().equalsIgnoreCase(questions[i][5])) {
                JOptionPane.showMessageDialog(null, 
                    "Correct!", 
                    "OOP Exam", 
                    JOptionPane.INFORMATION_MESSAGE);
                networkInfraScore++;
            }
            else {
                JOptionPane.showMessageDialog(null, 
                    "Incorrect! The correct answer is: " + questions[i][5], 
                    "OOP Exam", 
                    JOptionPane.INFORMATION_MESSAGE);
            }
        }

        double totalScore = (networkInfraScore / 5.0) * 100;
        double weight;

        if  (totalScore > 100.0 || totalScore < 0) {
            weight = 0.00;
        } else if (totalScore >= 98.0) {
            weight = 1.00;
        } else if (totalScore >= 95.0) {
            weight = 1.25;
        } else if (totalScore >= 92.0) {
            weight = 1.50;
        } else if (totalScore >= 89.0) {
            weight = 1.75;
        } else if (totalScore >= 86.0) {
            weight = 2.00;
        } else if (totalScore >= 83.0) {
            weight = 2.25;
        } else if (totalScore >= 80.0) {
            weight = 2.50;
        } else if (totalScore >= 76.0) {
            weight = 2.75;
        } else if (totalScore == 75.0) {
            weight = 3.00;
        } else {
            weight = 5.00;  
        }

        JOptionPane.showMessageDialog(null, "You have completed the OOP Exam!\nScore: " + networkInfraScore + "/5\nGrade: " + totalScore + "%\n" + "Weight: " + weight, "Network Infrastructure Exam", JOptionPane.INFORMATION_MESSAGE);
        
        return weight;
    }  

    public static double dataStructure() {
        String[][] questions = {
            {"1. It is a specialized format to store and organize data in a computer's memory or disk", "data structures"},
            {"2. An ordered set of a variable number if elements to which additions and deletions may be made", "list"},
            {"3. It is a technique in programming that calls itself", "recursion"},
            {"4. It is an ordered list where all operations are restricted at one end of the list known as the top", "stacks"},
            {"5. It is a list that do not  require a considerable amount of insertion and deletion operation", "linked list"}
        };            

        int dataStructurescore = 0;

        for (int i = 0; i < questions.length; i++) {
            String userAsking = JOptionPane.showInputDialog(null, 
                "Identification:\n\n" +
                questions[i][0] + "\n",
                "Data Structure Exam - Question " + (i + 1), 
                JOptionPane.QUESTION_MESSAGE);
            
            if (userAsking == null) {
                JOptionPane.showMessageDialog(null, 
                    "You cannot exit or cancel while taking the exam.", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                i--;
            }
            else if (userAsking.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, 
                    "Please provide an answer.", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                i--;
            }
            else if (userAsking.trim().equalsIgnoreCase(questions[i][1])) {
                JOptionPane.showMessageDialog(null, 
                    "Correct!", 
                    "Data Structure Exam", 
                    JOptionPane.INFORMATION_MESSAGE);
                dataStructurescore++;
            }
            else {
                JOptionPane.showMessageDialog(null, 
                    "Incorrect! The correct answer is: " + questions[i][1], 
                    "Data Structure Exam", 
                    JOptionPane.INFORMATION_MESSAGE);
            }
        }

        double totalScore = (dataStructurescore / 5.0) * 100;
        double weight;

        if  (totalScore > 100.0 || totalScore < 0) {
            weight = 0.00;
        } else if (totalScore >= 98.0) {
            weight = 1.00;
        } else if (totalScore >= 95.0) {
            weight = 1.25;
        } else if (totalScore >= 92.0) {
            weight = 1.50;
        } else if (totalScore >= 89.0) {
            weight = 1.75;
        } else if (totalScore >= 86.0) {
            weight = 2.00;
        } else if (totalScore >= 83.0) {
            weight = 2.25;
        } else if (totalScore >= 80.0) {
            weight = 2.50;
        } else if (totalScore >= 76.0) {
            weight = 2.75;
        } else if (totalScore == 75.0) {
            weight = 3.00;
        } else {
            weight = 5.00;  
        }

        JOptionPane.showMessageDialog(null, "You have completed the Data Structure Exam!\nScore: " + dataStructurescore + "/5\nGrade: " + totalScore + "%\nWeight: " + weight, "Data Structure Data Structure", JOptionPane.INFORMATION_MESSAGE);     
        return weight;
    }

    public static double networkInfrastructure() {
        String[][] questions = {
            {"1. What does LAN stand for?", "A. Local Area Network", "B. Large Area Network", "C. Long Area Network", "D. Light Area Network", "A"},
            {"2. Which device is used to connect multiple devices in a network and direct data packets between them?", "A. Router", "B. Switch", "C. Modem", "D. Hub", "B"},
            {"3. What is the primary purpose of a firewall in network security?", "A. To monitor network traffic", "B. To block unauthorized access", "C. To encrypt data", "D. To provide Wi-Fi connectivity", "B"},
            {"4. Which protocol is commonly used for secure communication over the internet?", "A. HTTP", "B. FTP", "C. HTTPS", "D. SMTP", "C"},
            {"5. What is an IP address?", "A. A unique identifier for a device on a network", "B. A type of network cable", "C. A software application for networking", "D. A wireless communication standard", "A"}
        };

        int networkInfraScore = 0;

        for (int i = 0; i < questions.length; i++) {
            String user_answer = JOptionPane.showInputDialog(null, 
                "Choose the letter of the correct answer:\n\n" +
                questions[i][0] + "\n\n" +
                questions[i][1] + "\n" +
                questions[i][2] + "\n" +
                questions[i][3] + "\n" +
                questions[i][4], 
                "Network Infrastructure Exam - Question " + (i + 1), 
                JOptionPane.QUESTION_MESSAGE);

            if (user_answer == null) {
                JOptionPane.showMessageDialog(null, 
                    "You cannot exit or cancel while taking the exam.", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                i--;
            }
            else if (user_answer.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, 
                    "Please provide an answer.", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                i--;
            }
            else if (user_answer.trim().length() > 1 || 
                    !"abcd".contains(user_answer.trim().toLowerCase())) {
                JOptionPane.showMessageDialog(null, 
                    "Please enter only a single letter (A, B, C, or D).", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                i--;
            }
            else if (user_answer.trim().equalsIgnoreCase(questions[i][5])) {
                JOptionPane.showMessageDialog(null, 
                    "Correct!", 
                    "Network Infrastructure Exam", 
                    JOptionPane.INFORMATION_MESSAGE);
                networkInfraScore++;
            }
            else {
                JOptionPane.showMessageDialog(null, 
                    "Incorrect! The correct answer is: " + questions[i][5], 
                    "Network Infrastructure Exam", 
                    JOptionPane.INFORMATION_MESSAGE);
            }
        }

        double totalScore = (networkInfraScore / 5.0) * 100;
        double weight;

        if  (totalScore > 100.0 || totalScore < 0) {
            weight = 0.00;
        } else if (totalScore >= 98.0) {
            weight = 1.00;
        } else if (totalScore >= 95.0) {
            weight = 1.25;
        } else if (totalScore >= 92.0) {
            weight = 1.50;
        } else if (totalScore >= 89.0) {
            weight = 1.75;
        } else if (totalScore >= 86.0) {
            weight = 2.00;
        } else if (totalScore >= 83.0) {
            weight = 2.25;
        } else if (totalScore >= 80.0) {
            weight = 2.50;
        } else if (totalScore >= 76.0) {
            weight = 2.75;
        } else if (totalScore == 75.0) {
            weight = 3.00;
        } else {
            weight = 5.00;  
        }

        JOptionPane.showMessageDialog(null, "You have completed the Network Infrastructure Exam!\nScore: " + networkInfraScore + "/5\nGrade: " + totalScore + "%\n" + "Weight: " + weight, "Network Infrastructure Exam", JOptionPane.INFORMATION_MESSAGE);
        
        return weight;
    }

    public static double organizationAndManagement() {

        String[][] questions = {
            {"1. What is the primary function of management in an organization?", "Planning"},
            {"2. Which management style involves making decisions without consulting employees?", "Autocratic"},
            {"3. What is SWOT analysis used for in strategic planning?", "Analysis"},
            {"4. Which organizational structure groups employees based on their functions or roles?", "Functional"},
            {"5. What is the purpose of performance appraisals in management?", "Evaluation"}
        };

        int orgManagementScore = 0;

        for (int i = 0; i < questions.length; i++) {
            String user_answer = JOptionPane.showInputDialog(null, 
                "Identification:\n\n" +
                questions[i][0] + "\n\n",
                "Organization and Management Exam - Question " + (i + 1), 
                JOptionPane.QUESTION_MESSAGE);

            if (user_answer == null) {
                JOptionPane.showMessageDialog(null, 
                    "You cannot exit or cancel while taking the exam.", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                i--;
            }
            else if (user_answer.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, 
                    "Please provide an answer.", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                i--;
            }
            else if (user_answer.trim().equalsIgnoreCase(questions[i][1])) {
                JOptionPane.showMessageDialog(null, 
                    "Correct!", 
                    "Organization and Management Exam", 
                    JOptionPane.INFORMATION_MESSAGE);
                orgManagementScore++;
            }
            else {
                JOptionPane.showMessageDialog(null, 
                    "Incorrect! The correct answer is: " + questions[i][1], 
                    "Organization and Management Exam Exam", 
                    JOptionPane.INFORMATION_MESSAGE);
            }
        }

        double totalScore = (orgManagementScore/ 5.0) * 100;
        double weight;

        if  (totalScore > 100.0 || totalScore < 0) {
            weight = 0.00;
        } else if (totalScore >= 98.0) {
            weight = 1.00;
        } else if (totalScore >= 95.0) {
            weight = 1.25;
        } else if (totalScore >= 92.0) {
            weight = 1.50;
        } else if (totalScore >= 89.0) {
            weight = 1.75;
        } else if (totalScore >= 86.0) {
            weight = 2.00;
        } else if (totalScore >= 83.0) {
            weight = 2.25;
        } else if (totalScore >= 80.0) {
            weight = 2.50;
        } else if (totalScore >= 76.0) {
            weight = 2.75;
        } else if (totalScore == 75.0) {
            weight = 3.00;
        } else {
            weight = 5.00;  
        }

        JOptionPane.showMessageDialog(null, "You have completed the Org. and Management Exam!\nScore: " + orgManagementScore + "/5\nGrade: " + totalScore + "%\nWeight: " + weight, "Org. and Management Exam", JOptionPane.INFORMATION_MESSAGE);
    
        return weight;
    }

    public static double storedOOPGrade() {
        return regOOPGrade;
    }

    public static double storedDataStructureGrade() {
        return regDataStructureGrade;
    }

    public static double storedNetworkInfrastructureGrade() {
        return regNetworkInfrastructureGrade;
    }
  
    public static double storedOrganizationAndManagementGrade() {
        return regOrganizationAndManagementGrade;
    }

    public static void resetExam() {
        if((regDataStructureGrade != 0) && (regNetworkInfrastructureGrade != 0) && (regOrganizationAndManagementGrade != 0) && (regOOPGrade != 0)) {
            regOOPGrade = 0;
            regDataStructureGrade = 0;
            regNetworkInfrastructureGrade = 0;
            regOrganizationAndManagementGrade = 0;

            JOptionPane.showMessageDialog(null, "You can now retake the exam.", "Reset Successful", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

class gradeCalculation {

    public static void subjectGrades() {
        
       double oopGrade = Menu.storedOOPGrade();
        double dataStructureGrade = Menu.storedDataStructureGrade();
        double networkInfrastructureGrade = Menu.storedNetworkInfrastructureGrade();
        double organizationAndManagementGrade = Menu.storedOrganizationAndManagementGrade();
        double gwa = gradecalculation(oopGrade, dataStructureGrade, networkInfrastructureGrade, organizationAndManagementGrade);

        JFrame frame = new JFrame("Student Grades");
        frame.setSize(450, 300);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);

        JLabel title = new JLabel("YOUR GRADES REPORT");
        title.setBounds(90, 20, 300, 30);
        title.setFont(new Font("Arial", Font.BOLD, 23));
        frame.add(title);

        String[] columns = {"Subject", "Grade"};
        Object[][] data = {
            {"OOP", oopGrade},
            {"Data Structure", dataStructureGrade},
            {"Network Infrastructure", networkInfrastructureGrade},
            {"Organization and Management", organizationAndManagementGrade},
            {"GWA", gwa}
        };

        JTable table = new JTable(data, columns);
        table.setEnabled(false);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 80, 350, 103); 
        frame.add(scrollPane);

        JButton closeBtn = new JButton("Close");
        closeBtn.setBounds(150, 200, 120, 30);
        closeBtn.addActionListener(e -> {
            frame.dispose();
            Menu.choices();
        });
        frame.add(closeBtn);

        frame.setVisible(true);
    }

    public static double gradecalculation(double oopGrade, double dataStructureGrade, double networkInfrastructureGrade, double organizationAndManagementGrade) {

        double gradeUnits = (oopGrade * 3) + (dataStructureGrade * 3) + (networkInfrastructureGrade * 3) + (organizationAndManagementGrade * 3);
        double gwa = gradeUnits / 12;

        return gwa;
    }
}

class Tuition {

    static DefaultTableModel paymentTableModel;

    public static boolean isTuitionPaid = false;

    public static void displayTuition() {      
        tuitionFeePayment();
    }

    private static void tuitionFeePayment() {
        
        JFrame frame = new JFrame("Tuition Fee Payment");
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel titleLabel = new JLabel("Tuition Fee Payment");
        titleLabel.setBounds(80, 20, 350, 25);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 23));
        frame.add(titleLabel);

        JLabel balanceLabel = new JLabel("Your current balance is: " + Registration.balanceStored() + " PHP");
        balanceLabel.setBounds(20, 60, 350, 25);
        frame.add(balanceLabel);

        JLabel instructionLabel = new JLabel("Pay Tuition (2,575 PHP):");
        instructionLabel.setBounds(20, 90, 200, 25);
        frame.add(instructionLabel);

        JTextField paymentField = new JTextField();
        paymentField.setBounds(20, 120, 350, 25);
        frame.add(paymentField);

        JButton submitBtn = new JButton("Submit Payment");
        submitBtn.setBounds(30, 160, 150, 30);
        frame.add(submitBtn);

        JButton cancelBtn = new JButton("Cancel");
        cancelBtn.setBounds(200, 160, 150, 30);
        frame.add(cancelBtn);

        JPanel tablePanel = new JPanel();
        tablePanel.setLayout(null);
        tablePanel.setBounds(20, 210, 350, 130);
        frame.add(tablePanel);

        String[] columns = {"Paid Amount", "Remaining Balance"};
        if (paymentTableModel == null) {
            paymentTableModel = new DefaultTableModel(columns, 0);
        }

        JTable paymentTable = new JTable(paymentTableModel);
        paymentTable.setEnabled(false);

        JScrollPane scrollPane = new JScrollPane(paymentTable);
        scrollPane.setBounds(0, 0, 350, 130);
        tablePanel.add(scrollPane);

        submitBtn.addActionListener(e -> {
            try {
                double userPay = Double.parseDouble(paymentField.getText().trim());

                if (userPay != 2575.0) {
                    JOptionPane.showMessageDialog(frame, "Please pay the exact amount of 2,575 PHP", "Payment Failed", JOptionPane.ERROR_MESSAGE);
                } else if (userPay > Registration.balanceStored()) {
                    JOptionPane.showMessageDialog(frame, "Insufficient Balance!", "Payment Failed", JOptionPane.ERROR_MESSAGE);
                } else {
                    double regTuitionFeePayment = Registration.balanceStored() - userPay;
                    Registration.newBalance(regTuitionFeePayment);
                    Registration.isTuitionpaid = true;
                    Menu.resetExam();

                    paymentTableModel.addRow(new Object[]{ 
                        userPay + " PHP", 
                        regTuitionFeePayment + " PHP" 
                    });

                    JOptionPane.showMessageDialog(frame, "Payment Successful!", "Payment Successful", JOptionPane.INFORMATION_MESSAGE);

                    frame.dispose();
                    Menu.choices();
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please type a number", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        cancelBtn.addActionListener(e -> {
            frame.dispose();
            Menu.choices();
        });

        frame.setVisible(true);
    }
}