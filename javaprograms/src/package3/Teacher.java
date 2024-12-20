package package3;

public class Teacher extends Employee{
	
	int ta=5000;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1=new Teacher();
		
		int totalsal=t1.ta+t1.basicsalary;
	System.out.println(totalsal);
	t1.show();
	t1.display();

	}
	
	public void show() {
		
		System.out.println(basicsalary);
		
	}

	
	
}
