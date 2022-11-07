// Even series 2,4,6,8,10

import java.util.Scanner;

class A1_19 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number of terms you need from the Even series : ");
		int n = sc.nextInt();
		
		int i = 2;
		
		while ( n != 0 ) {
			System.out.print(i + " ");
			i += 2;
			n--;
		}
		
		System.out.println();
	}
	
}