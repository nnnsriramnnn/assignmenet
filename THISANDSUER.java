package operators;

class A {
	
	String name;
	
	A() {
		
	}
	
	A(String name) {
		this();
		this.name = name;
	}
	
}

class B extends A {
	
	B() {
		super("sriram");
	}
	
}

public class THISANDSUER {

	public static void main(String[] args) {
		
		A a = new A("Hi");
		
	   System.out.println(a.name);
	
	}
	
}
	

