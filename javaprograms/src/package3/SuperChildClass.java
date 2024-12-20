package package3;

public class SuperChildClass extends SuperParentClass {
	String colour="white";
	
	SuperChildClass(){
		
		super();//calling super class constructor,can also use without super(); as it automatically invoke parent class constructor
		
	}
	
	


	public static void main(String[] args) {
	
		SuperChildClass s1=new SuperChildClass();
		s1.display();
		

	}
	
public void display() {
	
	    super.show();//calling the parent class method
	    System.out.println(colour);
		System.out.println(super.colour);//calling the parent class variable 
		
		
	}


}
