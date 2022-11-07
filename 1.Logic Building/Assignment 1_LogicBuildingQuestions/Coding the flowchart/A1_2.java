// program to find factorial of a number

import java.util.Scanner;

class A1_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a positive number : ");
		int num = sc.nextInt();
		
		if(num <= 0){
			System.out.println("Number is not positive");
		}
		
		else {
			int fact = 1;

			while ( num != 1 ) {
				
				fact *= num;
				num--;
			
			}
			
			System.out.println("Factorial is : " + fact);
			
		}

	}
}

// larger numbers cannot be taken as input as of now in this