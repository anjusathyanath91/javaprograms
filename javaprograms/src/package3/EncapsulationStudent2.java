package package3;

public class EncapsulationStudent2 {

	public static void main(String[] args) {
		
		EncapsulationStudent e1=new EncapsulationStudent();
		
		e1.setId(100); //set values using object of required class 
		e1.setName("anju");
		e1.setMark(50);
		System.out.println(e1.getId()); //get values object of required class 
		System.out.println(e1.getName());
		System.out.println(e1.getMark());
	}

}
