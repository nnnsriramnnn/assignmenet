package operators;

public class ARRAY2 {
	
	public static void main(String[] args) {
		
		int a [] = { 2, 4, 6, 8 };
		
		int sum = 0;
		
		for(int i = 0; i< a.length; i++) {
			sum = sum+a[i];
		}
		
		int average = sum/a.length;
		
		System.out.println(average);
		
	}

}
