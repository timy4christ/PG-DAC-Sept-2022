// program to find factorial using Recursion

import java.util.Scanner;

class A1_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a positive number : ");
		int n = sc.nextInt();
		
		if(n > 0){
			System.out.println("Factorial is : " + factorial(n));
		}
		
		else {
			System.out.println("Number is not positive");
		}
		
	}
	public static int factorial(int n) {
		
		if ( n == 1 )
			return 1;
		
		else
			return n * factorial(n-1);
	}
}

// cannot handle larger inputs