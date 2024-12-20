package Assignments;

public class Salary extends EmployeeDetails {

    protected double hra;
    protected double pf;

    // Method to calculate HRA and PF
    public void calculateComponents() {
        hra = 0.05 * basicPay;  // HRA is 5% of basic pay
        pf = 0.20 * basicPay;   // PF is 20% of basic pay
    }
}

