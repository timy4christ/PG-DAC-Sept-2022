// is it Palindrome or not

import java.util.Scanner;

class A1_17 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the number : ");
		int n = sc.nextInt();
		
		int lastDigit;
		int reverse = 0;
		int temp = n;
		
		while ( temp != 0 ) {
			lastDigit = temp % 10;
			reverse = reverse * 10 + lastDigit;
			temp /= 10;
		}
		
		System.out.println(reverse == n ? (n + " is Palindrome") : (n + " is not Palindrome"));
	
	}
}
