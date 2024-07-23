package Method_Overloading_and_Overriding;

public class NonStatic_Method_Overloading {

	void add(int a) {
		System.out.println("I am  int datatype");
	}

	void add(int a, int b) {
		
		System.out.println("I am  two int datatype");
	}

	void add(int a, String b) {
		System.out.println("I am  int and string datatype");

	}

	public static void main(String[] args) {
		NonStatic_Method_Overloading s= new NonStatic_Method_Overloading();
		s.add(100,"RAJAN");
		s.add(100,200);
		s.add(500);

	}

}
