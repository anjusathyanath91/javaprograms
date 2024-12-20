package package3;

public class EncapsulationStudent {

	
	private int id;
	private String name;
	private int mark;
	
	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		
	/** can call the private variable from the same class itself or from another class */	
 /*EncapsulationStudent e1=new EncapsulationStudent();
		
		e1.setId(100); //set values using object of the same class class
		e1.setName("anju");
		System.out.println(e1.getId()); //get values using object of the same class
		System.out.println(e1.getName());*/

	}

}
