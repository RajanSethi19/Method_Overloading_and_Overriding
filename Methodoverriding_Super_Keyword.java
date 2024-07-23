package Method_Overloading_and_Overriding;

class world {
	void add() {
		System.out.println("I am in class world");
	}

}

public class Methodoverriding_Super_Keyword extends world {

	void add() {
		super.add();

		System.out.println("i am in class methodoverloading");
	}

	public static void main(String[] args) {

		Methodoverriding_Super_Keyword mc = new Methodoverriding_Super_Keyword();
		mc.add();
	}

}
