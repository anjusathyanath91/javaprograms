package Assignments;

public class AreaMethodOverload {

	public static void main(String[] args) {
		AreaMethodOverload obj1=new AreaMethodOverload();
		obj1.area(15.2f);
		obj1.area(10,20);
		obj1.area(5);

	}
	//area of circle
	public void area(float radius) {
		
		float pi=3.14f;
		
		float area = pi*radius*radius;
		
		System.out.println("area of a circle:"+area);
		
	}

	//area of rectangle
		public void area(int length,int width) {
			

			
			int area = length*width;
			
			System.out.println("area of a rectangle:"+area);
			
		}
		
		//area of square
				public void area(int side) {
					

					
					int area = side*side;
					
					System.out.println("area of a square:"+area);
					
				}
	
	
}
