package java_basics;

import java.util.*;

public class PRIME_NUMBER {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check prime or not");
		
		int num = sc.nextInt();
		
		int factor = 0;
		
		for(int i = 1; i<=num; i++) {
			
			if(num%i == 0) {
				factor ++;
			}
			
		}
		
		if(factor == 2) {
			System.out.println("Given number is prime");
		}
		else {
			System.out.println("Given number is not prime");
		}
		
	}
	

}
