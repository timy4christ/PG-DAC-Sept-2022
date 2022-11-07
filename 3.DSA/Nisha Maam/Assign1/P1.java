// Write a program to print a series of numbers with recursive Java methods 
// Eg. 1 2 3 4 5 6
import java.util.Scanner;

class P1{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		series(n);
	}
	
	public static void series(int n){
		
		if(n==1) {
			System.out.print(n + " ");
			return;
		}
		
		series(n-1);
		System.out.print(n + " ");
	}
}