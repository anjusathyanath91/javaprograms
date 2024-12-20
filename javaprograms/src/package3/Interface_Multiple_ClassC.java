package package3;

public class Interface_Multiple_ClassC implements Interface_Multiple_A,Interface_Multiple_B{

	public static void main(String[] args) {
		
		Interface_Multiple_ClassC obj=new Interface_Multiple_ClassC();
		obj.print();
		

	}
	
	public void print() {
		
		System.out.println("multiple inheritance");
	}

}
