// prime factors of a number

import java.util.Scanner;

class A1_18 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter a positive number : ");
		int n = sc.nextInt();
		
		/*
		if(n<=0){
			System.out.println("The number is not positive");
		}
		
		else {
			System.out.print("Prime Factors of are: ");
		
			for ( int i = 2; i < n; i++ ) {
				
				if ( n % i == 0 ) { // check i is a factor or not
					
					
					boolean isPrime = true;
					
					for ( int j = 2; j <= (i / 2); j++ ) { 
						
						if( i % j == 0 ) { //check i is prime or not
							isPrime = false;
							break;
						}
					}
					
					if ( isPrime )  
						System.out.print(i + ", ");	
		
				} 
			}
			System.out.println();
		*/	
			
			// Method 2
			System.out.println("Below is a better method to solve prime : ");
			
			int i = 2;
			
			System.out.print("Prime Factors of are: ");
			
			while(n > 1){
				
				if ( n % i == 0 ) { 
					System.out.print(i + " ");
					n = n / i; 
				} 
				
				else {
					i++;
				}
			}
			System.out.println();
		
		
	}
}