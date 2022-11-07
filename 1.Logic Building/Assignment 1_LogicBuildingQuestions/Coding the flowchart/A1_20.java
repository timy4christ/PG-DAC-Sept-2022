// Odd series 1,3,5,7,9.....

import java.util.Scanner;

class A1_19 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number of terms you want from Odd Series : ");
		int n = sc.nextInt();
		
		int i = 1;
		
		while ( n != 0 ) {
			System.out.print(i + " ");
			i += 2;
			n--;
		}

	}
	
}