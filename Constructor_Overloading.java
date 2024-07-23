package Method_Overloading_and_Overriding;

public class Constructor_Overloading {

	Constructor_Overloading(int a) {
		System.out.println("I am in int datatype");
	}

	Constructor_Overloading(String s) {
		this(10);
		System.out.println("I am in String datatype");
	}

	Constructor_Overloading(char c) {
		this("Rajan");
		System.out.println("I am in char datatype");

	}

	public static void main(String[] args) {
		/*
		 * Constructor_Overloading c= new Constructor_Overloading("RAJAN");
		 * Constructor_Overloading c1= new Constructor_Overloading(100);
		 * Constructor_Overloading c2= new Constructor_Overloading('R');
		 */
		// new Constructor_Overloading("RAJAN");
		// new Constructor_Overloading(100);
		new Constructor_Overloading('R');

	}

}
