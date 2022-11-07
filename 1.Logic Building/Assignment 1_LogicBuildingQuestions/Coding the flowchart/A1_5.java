// check number is positive or negative
import java.util.Scanner;
class A1_5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number : ");
		int n = sc.nextInt();
		
		if ( n >= 0 ) { // considered zero as positive here
			System.out.println(n + " is Positive");
		}
		
		else {
			System.out.println(n + " is Negative");
		}
		
	}
}