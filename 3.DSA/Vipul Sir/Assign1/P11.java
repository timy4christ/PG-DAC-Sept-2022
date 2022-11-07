/*
Q11. 

Given a string, compute recursively a new string where all 'x' chars have been removed.

Input format :
String S

Output format :
Modified String

Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string S. 

Sample Input 1 :
xaxb
Sample Output 1:
ab

Sample Input 2 :
abc
Sample Output 2:
abc

Sample Input 3 :
xx
Sample Output 3:
*/


import java.util.Scanner;

class P11{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String res ="";
		
		res = filterDupes(0,s,res);
		
		System.out.println(res);
		
	}
	
	public static String filterDupes(int i, String s, String res){
		
		if(i==s.length()){
			return res;
		}
		
		if(s.charAt(i)!='x'){
			res += s.charAt(i);
		}
		
		return filterDupes(i+1,s,res);
	}
	
}