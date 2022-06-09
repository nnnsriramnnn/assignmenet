package operators;

interface A  {
	void print();
}

class B implements A {
	public void print() {
		System.out.println("Hi");
	}
}

public class INTERFACE1 {

	public static void main(String[] args) {
		
		A a = new B();
		
		a.print();
	}
	
}
	

