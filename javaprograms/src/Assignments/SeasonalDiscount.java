package Assignments;

public class SeasonalDiscount {
	public static void main(String[] args) {

		double price = 2500.0; // Example price

		// Create instances of Offseason and Onseason
		SeasonalDiscount offseasonDiscount = new SeasonalDiscount();
		SeasonalDiscount onseasonDiscount = new SeasonalDiscount();

		// Calculate and print the discount for off-season
		double offseasonDiscountAmount = offseasonDiscount.discount(price);
		System.out.println("Offseason Discount: " + offseasonDiscountAmount);
		System.out.println("Price after Offseason Discount: " + (price - offseasonDiscountAmount));

		// Calculate and print the discount for on-season
		double onseasonDiscountAmount = onseasonDiscount.discount(price);
		System.out.println("Onseason Discount: " + onseasonDiscountAmount);
		System.out.println("Price after Onseason Discount: " + (price - onseasonDiscountAmount));
	}

	private double discount(double price) {
		// TODO Auto-generated method stub
		return 0;
	}
}
