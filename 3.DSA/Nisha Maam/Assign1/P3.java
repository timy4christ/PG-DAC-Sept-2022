// Write a program to calculate a factorial in Java with recursion 
  
import java.util.Scanner;

class P3{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fact(n,1); // parameterized recursion
	}
	
	public static void fact(int n, int prod){
		
		if(n==1){
			System.out.println(prod);
			return;
		}
		
		fact(n-1, prod*n);
	}

}