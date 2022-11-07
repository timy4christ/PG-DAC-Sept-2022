// factors of a given number

import java.util.Scanner;
class A1_9 { 
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a positive number : ");
		int n = sc.nextInt();
		
		if(n <= 0){
			System.out.println("The number is not positive");
		}
		
		else {
			System.out.print("The factors are : ");
		
			for ( int i = 1; i <= n; i++ ) {
				if ( n % i == 0 ) 
					System.out.print( i + ", " );
			}
		
			System.out.println();
		}
		
	}

}