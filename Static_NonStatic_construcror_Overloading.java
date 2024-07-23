package Method_Overloading_and_Overriding;

public class Static_NonStatic_construcror_Overloading {

	static void add(String s) {
		System.out.println("I am in static method with string datatype");
	}

	static void add(int a) {
		System.out.println("I am in static method with int datatype");
	}

	void add(double d) {
		System.out.println("I am in non-static method with double datatype");
	}

	void add(char c) {
		System.out.println("I am in non-static method with char datatype");
	}

	Static_NonStatic_construcror_Overloading(String b) {
		System.out.println("I am in constructor with string datatype");
	}
	Static_NonStatic_construcror_Overloading(int b) {
		this("rajan");
		System.out.println("I am in constructor with int datatype");
	}

	public static void main(String[] args) {
		add(10);
		add("RAJAN");
		//Static_NonStatic_construcror_Overloading sc = new Static_NonStatic_construcror_Overloading("SETHI");
		Static_NonStatic_construcror_Overloading sc1 = new Static_NonStatic_construcror_Overloading(10);
		sc1.add('R');
		sc1.add(22.00);

	}

}
