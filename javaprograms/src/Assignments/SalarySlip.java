package Assignments;

public class SalarySlip extends Salary {

    private double totalSalary;

    // Method to calculate the total salary
    public void calculateTotalSalary() {
        totalSalary = basicPay + hra - pf - deduction + bonus;
    }

    // Method to print the salary slip
    public void printSalarySlip() {
        System.out.println("\nSalary Slip:");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Deduction: " + deduction);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary by hand: " + totalSalary);
    }
    
    public static void main(String[] args) {
        SalarySlip salarySlip = new SalarySlip();

        // Get employee details
        salarySlip.inputDetails();

        // Calculate salary components
        salarySlip.calculateComponents();

        // Calculate total salary
        salarySlip.calculateTotalSalary();

        // Print salary slip
        salarySlip.printSalarySlip();
    }
}
