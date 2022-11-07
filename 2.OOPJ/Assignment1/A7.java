// Write a program to swap two numbers without using third variable.

import java.util.Scanner;

class A7{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		System.out.print("a = ");
		int a = sc.nextInt(); 
		System.out.print("b = ");	
		int b = sc.nextInt(); 
		
		a = a * b; 
		b = a / b; 
		a = a / b;
		
		System.out.println("After Swapping: ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);		
		
	}
}