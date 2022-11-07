// GCD of two number

import java.util.Scanner;

class A1_14 { 
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the first number : ");
		int a = sc.nextInt(); 
		
		System.out.print("Enter the second number : ");
		int b = sc.nextInt(); 
		
		int gcd = 1;
		
		for ( int i = 2; (i <= a/2) || (i <= b/2); i++ ) {
			if ( (a % i == 0) && (b % i == 0) ) {
				gcd = i;
			}	
		}
		System.out.println("\nGreatest common divisor is " + gcd);
	
	}

}

// i is initialized to because 1 is already a factor of all numbers
// the loop only goes till a/2 or b/2 because max factor of a number 
// is always less than or equal to the half