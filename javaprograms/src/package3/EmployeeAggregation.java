package package3;

public class EmployeeAggregation {
	
	int id;
	String name;
	AddressAggregation address;
	

	public static void main(String[] args) {
		
		AddressAggregation a1=new AddressAggregation(123,"India","Kochi","Kerala");
		
		EmployeeAggregation e1=new EmployeeAggregation(100,"Anju",a1);
		
		e1.display();

	}


	public EmployeeAggregation(int id, String name, AddressAggregation address) {
		//super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void display() {
		
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(address.city);
		System.out.println(address.state);
		System.out.println(address.country);
		System.out.println(address.zip);
	}

}
