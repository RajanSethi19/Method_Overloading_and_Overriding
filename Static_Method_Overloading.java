package Method_Overloading_and_Overriding;

public class Static_Method_Overloading {

	static void add(int a) {
		
System.out.println("I am  int datatype");
	}

	static void add(int a, int b) {
		System.out.println("I am  two int datatype");
	}

	static void add(double a, int b) {
		
		double sum=a+b;
		System.out.println("I am  double and string datatype");

	}

	public static void main(String[] args) {
		add(10,20);
		add(10);
		add(10.23,10);
		
		

	}

}
