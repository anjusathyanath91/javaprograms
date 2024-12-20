package Assignments;

public class DivisibilityCheck extends Addition {

    // Constructor to initialize numbers and call the superclass constructor
    public DivisibilityCheck(int num1, int num2) {
        super(num1, num2);  // Call to the superclass constructor
    }

    // Method to check if the addition result is divisible by 10
    public void checkDivisibility() {
        int result = super.getAdditionResult();  // Call to the superclass method
        if (result % 10 == 0) {
            System.out.println("The addition result " + result + " is divisible by 10.");
        } else {
            System.out.println("The addition result " + result + " is not divisible by 10.");
        }
    }
    

        public static void main(String[] args) {
            // Initialize numbers and create an instance of DivisibilityCheck
            DivisibilityCheck check = new DivisibilityCheck(10, 20);  // Example values

            // Check if the addition result is divisible by 10
            check.checkDivisibility();
        }
    }


