package java_basics;

public class STATIC1 {
	
	static String name1 = "sriram";
	
	String name2 = "harsha"; 
	
	
	static String name1() {
		return name1;
	}
	
	String name2() {
		return new STATIC1().name2;
	}
	
	public static void main(String[] args) {
		
		System.out.println(name1());
		
		System.out.println(new STATIC1().name2());
		
	}

}
