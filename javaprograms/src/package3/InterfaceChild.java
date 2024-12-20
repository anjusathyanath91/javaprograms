package package3;

public class InterfaceChild implements InterfacePrintable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfacePrintable obj=new InterfaceChild();
		obj.print();
	}

	public void print() {
		System.out.println("Inside child class");
	}

}
