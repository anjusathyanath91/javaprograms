package Assignments;

import java.util.Scanner;

public class EmployeeDetails {
    protected double basicPay;
    protected double deduction;
    protected double bonus;

    // Method to get employee details from the console
    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter basic pay: ");
        basicPay = scanner.nextInt();

        System.out.print("Enter deduction: ");
        deduction = scanner.nextInt();

        System.out.print("Enter bonus: ");
        bonus = scanner.nextInt();
    }
    

        
    }


