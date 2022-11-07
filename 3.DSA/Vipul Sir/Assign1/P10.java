/*
Q10.
Given a string S, remove consecutive duplicates from it recursively.

Input Format :
String S

Output Format :
Output string

Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string

Sample Input 1 :
aabccba
Sample Output 1 :
abcba

Sample Input 2 :
xxxyyyzwwzzz
Sample Output 2 :
xyzwz
*/


import java.util.Scanner;

class P10{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String res ="";
		
		res = filterDupes(0,s,res);
		
		System.out.println(res);
		
	}
	
	public static String filterDupes(int i, String s, String res){
		
		if(i==s.length()-1){
			res += s.charAt(i);
			return res;
		}
		
		if(s.charAt(i)!=s.charAt(i+1)){
			res += s.charAt(i);
		}
		
		return filterDupes(i+1,s,res);
	}
	
}