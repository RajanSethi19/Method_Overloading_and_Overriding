package Method_Overloading_and_Overriding;


class bike  {
	void start() {
	//	super.start();
		System.out.println("Start with self");
		
	}

}

public class Method_Overriding extends bike {

	void start() {
	//	super.start();
		System.out.println("Start with button");
		
	}

	public static void main(String[] args) {
		
	//	Method_Overriding m= new Method_Overriding();
		
		bike b1=new bike();
		b1.start();
	

	}

}
