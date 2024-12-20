package Assignments;

public class AverageMethodOverload {

	public static void main(String[] args) {
		
		AverageMethodOverload obj1=new AverageMethodOverload();
		obj1.average(10, 20, 30);
		obj1.average(1.25f, 3.50f, 4.5f);
		

	}
	
	 public void average(int n1, int n2, int n3) {
	       int avg=(n1 + n2 + n3) / 3;
	       System.out.println("Integer average:"+avg);
	    }

	 
	 
	 public void average(float f1, float f2, float f3) {
		 float avg=(f1 + f2 + f3) / 3;
		 System.out.println("Float average:"+avg);
	    }
}
