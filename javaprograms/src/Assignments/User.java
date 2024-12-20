package Assignments;

import java.util.Scanner;

public class User {
    private Banks bank;

    // Constructor to initialize Bank instance
    public User(Banks bank) {
        this.bank = bank;
    }

    // Method to get PIN from the use
    public void enterPin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your PIN: ");
        int userPin = scanner.nextInt();

        bank.setPin(userPin);

       
        if (bank.validatePin(userPin)) {
            System.out.println("PIN validated successfully.");


        } else {
            System.out.println("Invalid PIN. Please try again.");
        }
    }
}
