package operators;

abstract class A  {
	abstract void print();
}

class B extends A {
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
	

