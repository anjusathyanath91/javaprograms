package package3;

public class TwoDigit {

	public static void main(String[] args) {
		int number1 = 10;   
	     int number2 = -10;  
	    

	     System.out.println(isTwoDigit1(number1)); 
	     System.out.println(isTwoDigit2(number2)); 

	}
	
	public static boolean isTwoDigit1(int number) {
        return number >= 10 && number <= 99;
    }
	
	 public static boolean isTwoDigit2(int number) {
	        return number >= 10 && number <= 99;
	    }
	 
	 
    

}
