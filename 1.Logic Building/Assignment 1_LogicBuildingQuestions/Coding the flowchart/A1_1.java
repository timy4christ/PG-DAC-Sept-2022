// program to find even or odd

import java.util.Scanner;

class A1_1 { 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number : ");
		int num = sc.nextInt();
		
		if ( num % 2 == 0 ) {
			System.out.println("Even");
		} 
		
		else { 
			System.out.println("Odd");
		}
			
	}
} 