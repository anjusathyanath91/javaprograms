package Assignments;

public class Banks {
    // Private field for PIN
    private int pin;

    // Method to set the PIN
    public void setPin(int pin) {
        this.pin = pin;
    }

    // Method to validate the PIN
    public boolean validatePin(int pin) {
        // Valid PINs
        final int[] validPins = {1001, 1234, 1212};
        
        // Check if the provided PIN matches any of the valid PINs
        for (int validPin : validPins) {
            if (this.pin == validPin && this.pin == pin) {
                return true;
            }
        }
        return false;
    }
}
