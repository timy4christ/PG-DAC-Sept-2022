/*
Q2.
Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false. Do this recursively.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
'true' or 'false'
Constraints :
1 <= N <= 10^3
Sample Input 1 :
3
9 8 10
8
Sample Output 1 :
true
Sample Input 2 :
3
9 8 10
2
Sample Output 2 :
false
*/


import java.util.Scanner;

class P2{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++){
			arr[i] = sc.nextInt();
		}
		
		int x = sc.nextInt();
		
		if(search(arr,x,0))
			System.out.println("true");
		else
			System.out.println("false");
		
	}
	
	public static boolean search(int[] arr, int x, int index){
		
		if(index == arr.length) return false;

		if(arr[index] == x) return true;
		
		return search(arr, x, index+1);
		
	}
}