package operators;

public class EXCEPTIONS {
	
	public static void main(String[] args) {
		
		try {
			int b = 7/0;
		}
		
		catch(ArithmeticException e) {
			System.out.println("Handled");
		}
		 
	}

}
