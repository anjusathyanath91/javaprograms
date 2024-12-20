package Assignments;

public class FactorialThis {

    
    private long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    
    public void printFactorial(int number) {
       
        long factorial = this.calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    public static void main(String[] args) {
    	FactorialThis calculator = new FactorialThis();
        calculator.printFactorial(5);
    }
}
