package operators;

public class ARRAY1 {

	public static void main(String[] args) {
		
		int a[] = { 2, 3, 4 };
		
		int sum = 0;
		
		for(int i = 0; i< a.length; i++) {
			sum = sum+a[i];
		}
		
		System.out.println(sum);
		
	}
	
}
