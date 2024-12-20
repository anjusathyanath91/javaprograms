package package3;

public class Hrmanager extends Manager {

	int da=6000;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hrmanager h1=new Hrmanager();
		int totalsal=h1.da+h1.basicsalary+h1.hra;
		System.out.println(totalsal);
		h1.show();
		h1.display();

	}

	
	public void show()
	{
		
		
		System.out.println(basicsalary);
	}
}
