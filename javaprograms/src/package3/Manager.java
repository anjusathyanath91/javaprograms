package package3;

public class Manager extends Employee {

	static int total_sal;
	int hra=500;
	
	public static void main(String[] args) {
		

		Manager m1=new Manager();
		m1.show();
		
		total_sal=m1.hra+m1.basicsalary;
		System.out.println(total_sal);
		m1.display();
		
	}

	public void show()
	
	{
		System.out.println(basicsalary);
		
		
	}
	
	
public void display() {  //method overriding
		
		System.out.println("Parent class employee111");
	}
	
}
