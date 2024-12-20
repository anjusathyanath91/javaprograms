package package3;

public class ChildOverridingClass extends ParentClass {

	public static void main(String[] args) {


		ChildOverridingClass c1=new ChildOverridingClass();
		c1.show(100);
		
		
	}
	
	
	public void show(int a) {
		
		
		System.out.println("Inside child method to override");
	}

}
