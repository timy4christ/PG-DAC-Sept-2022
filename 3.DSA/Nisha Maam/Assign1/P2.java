// Write a program to sum a series of numbers with Java recursion  
import java.util.Scanner;
class P2{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = sumOfSeries(n);
		System.out.println(sum);
	}
	
	public static int sumOfSeries(int n){
		
		if(n==1) return 1;
		
		return sumOfSeries(n-1) + n;
	}
}