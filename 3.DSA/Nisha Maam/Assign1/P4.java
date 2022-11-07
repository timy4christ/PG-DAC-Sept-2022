// Write a program to print the Fibonacci series with Java and recursion 
  
import java.util.Scanner;

class P4{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(fib(n));
		
	}
	
	public static int fib(int n){
		
		if(n<=1) return 1;
		
		int prev = fib(n-1);
		int beforePrev = fib(n-2);
		
		return prev + beforePrev;
	}
	

}