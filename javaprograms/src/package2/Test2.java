package package2;

import package1.Test; // imports package 1 to package 2



public class Test2 extends Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Test2 t2 = new Test2(); // created object for class "Test" which comes under package1.if we use extends for child class then ude child class object to call protected method
		t2.display();

		

	}

}
