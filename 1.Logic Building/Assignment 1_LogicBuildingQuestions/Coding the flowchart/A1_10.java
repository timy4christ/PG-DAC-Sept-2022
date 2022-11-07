// sum of digits of a given number

import java.util.Scanner;

class A1_10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a number : ");
		int n = sc.nextInt();
		
		int digit = 0;
		int sum = 0;
		
		while ( n != 0 ) {
			digit = n % 10; // gives the last digit 
			sum += digit;
			n /= 10;
			System.out.println("digits : " + digit + " sum : " + sum);
		}
		
		System.out.println("Sum of digits : " + sum);
		
	}
}

// it doesnot work for negative numbers