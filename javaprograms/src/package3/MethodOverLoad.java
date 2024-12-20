package package3;

public class MethodOverLoad {

	public static void main(String[] args) {
		MethodOverLoad m=new MethodOverLoad();
		m.sum (10,20);
		m.sum(1.5f,2.5f);
		m.sum(0.5,8.5,7.5);

	}
	public void sum(int a,int b){

		int c=a+b;
		System.out.println("Sum :"+c);

		}
		public void sum (float x,float y){

		float z=x+y;
		System.out.println("Sum :"+z);

		}
		public void sum (double a,double b,double c){

		double d=a+b+c;
		System.out.println("Sum :"+d);

		}


		}

