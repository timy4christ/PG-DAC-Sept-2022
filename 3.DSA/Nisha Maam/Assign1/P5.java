// Write a program to implement a recursive Java palindrome checker 

// this program is however not case sensitive

import java.util.Scanner;

class P5{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		if(isPalindrome(0,s))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");
	}
	
	public static boolean isPalindrome(int i, String s){
		
		if(i>=(s.length()/2)) return true;
		
		if(s.charAt(i) == s.charAt(s.length()-i-1))
			return isPalindrome(i+1,s);
		else
			return false;	
	}
}