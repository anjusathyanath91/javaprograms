package Assignments;

public class PinVerification {
    public static void main(String[] args) {
        // Create an instance of Bank
        Banks bank = new Banks();
        
        // Create an instance of User with the Bank instance
        User user = new User(bank);
        
        // User enters PIN
        user.enterPin();
    }
}

