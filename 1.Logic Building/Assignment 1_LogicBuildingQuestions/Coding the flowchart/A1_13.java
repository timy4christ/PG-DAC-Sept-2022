// Reverse a number

import java.util.Scanner;

class A1_13 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("\nEnter the number : ");
		int n = sc.nextInt();
		
		int lastDigit;
		int reverse = 0;
		
		while ( n != 0 ) {
			lastDigit = n % 10; 
			reverse = reverse * 10 + lastDigit;
			n /= 10;
		}
		
		System.out.println("Reversed Number : " + reverse);
	
	}
}
