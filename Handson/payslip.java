public class payslip {
    public static void main(String[] args) {
        String name = "Reymond Joaquin";
        int employeeID = 12345678;
        String department = "IT";
        int salary = 20000;
        
        int SSS = 1000;
        int pagibig = 2000;
        int tax = 100;

        int deduction = SSS + pagibig + tax;
        int total = salary - deduction;

        System.out.println("PAYSLIP\n");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Deduction: ");
        System.out.println("\tSSS: " + SSS);
        System.out.println("\tPag-Ibig: " + pagibig);
        System.out.println("\tTax: " + tax);
        System.out.println("Total Deduction: " + deduction);
        System.out.println("Netpay: " + total);
    }

}
