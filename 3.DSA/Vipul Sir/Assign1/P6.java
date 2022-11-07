/*
Q6.
Given the code to find out and return the number of digits present in a number recursively. 
Input Format :
Integer n
Output Format :
Count of digits
Constraints :
1 <= n <= 10^6
Sample Input 1 :
 156
Sample Output 1 :
3
Sample Input 2 :
 7
Sample Output 2 :
1
*/


import java.util.Scanner;

class P6{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(countDigit(n,0));
				
	}
	
	public static int countDigit(int n, int count){
		
		if(n==0) return count;
		
		return countDigit(n/10,count+1);
		
	}
}