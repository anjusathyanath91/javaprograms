package Assignments;

public class ReverseNumber {

   
    private int number;

   
    public ReverseNumber() {
        System.out.println("Finding reverse...");
    }

    // Constructor to calculate the reverse of the number
    public ReverseNumber(int number) {
        this.number = number;  // Set the instance variable to the argument
        calculateReverse();    // Call the method to calculate and display the reverse
    }

    // Method to calculate and print the reverse of the number
    private void calculateReverse() {
        int originalNumber = number;
        int reversedNumber = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            originalNumber /= 10;
        }

        System.out.println("The reverse of the number " + number + " is: " + reversedNumber);
    }

    public static void main(String[] args) {
      
        new ReverseNumber();

      
        new ReverseNumber(12345);
    }
}
