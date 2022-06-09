package java_basics;

public class QUE5 {
	
	static String name = "Sriram";  // Global variable
	
	int num = 890;
	
	public static void main(String[] args) {
		
		String name = "Hi";  // local variable 
		
		int num = 4567;
		
		System.out.println("Printing local String variable "+name);
		
		System.out.println("Printing local int variable "+num);
		
		System.out.println("Printing static class variable "+ QUE5.name);
		
		QUE5 que5 = new QUE5();
		
		System.out.println("Printing instance int variable "+ que5.num);
		
		
	}

}
