package Assignments;

public class TotalAmountCalculator {

    private double pricePerItem;
    private int quantity;

    // Parameterized constructor
    public TotalAmountCalculator(double pricePerItem, int quantity) {
        this.pricePerItem = pricePerItem;
        this.quantity = quantity;
    }

    // Method to calculate the total amount
    public double calculateTotalAmount() {
        return pricePerItem * quantity;
    }

    public static void main(String[] args) {
       
        TotalAmountCalculator item1 = new TotalAmountCalculator(15.50, 10);
       

        
        double totalAmount1 = item1.calculateTotalAmount();
       

        System.out.println("Total amount for item 1: " + totalAmount1);
      
    }
}
