// check whether number is Armstrong number;

import java.util.Scanner;

class HW3 {
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter a number : ");
			int n = sc.nextInt();
			
			int digitCount = 0;
			int temp = n;
			
			while( temp != 0 ) {
				digitCount++;
				temp /= 10;			
			}
			
			int result = 0;
			int digit = 0;
			temp = n;
			
			while ( temp != 0 ) {
				digit = temp % 10;
				result += (int)Math.pow(digit, digitCount);
				temp /= 10;
			}
			
			System.out.println(result == n ? "Armstrong" : "Not Armstrong");
			
	}
}