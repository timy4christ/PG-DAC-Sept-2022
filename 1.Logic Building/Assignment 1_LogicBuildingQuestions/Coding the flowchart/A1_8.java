// print digits of given number

import java.util.Scanner;

class A1_8 {
	public static void main(String[] args) { 
	
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number : ");
		int n = sc.nextInt();
			

		if(n == 0){
			System.out.println("The digit is : 0");
		} 
		
		else {
			int digit;
			int reverse=0;
			int temp = n; // so that input will not be effected

			System.out.print("The digits are : ");

			do {
				digit = temp % 10;
				reverse = reverse * 10 + digit;
				temp /= 10;		
				// System.out.print(digit + " "); // prints the digits in reverse thou
			}while ( temp != 0 ); 

			temp = reverse;
			
			do{
				
				digit = temp % 10;
				temp /= 10;		
				
				System.out.print(digit + ", "); 
			}while ( temp != 0 ); 
				
			System.out.println();	
		}	
	}
}

// have not considered case for negative numbers