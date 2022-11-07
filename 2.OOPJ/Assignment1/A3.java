/*
*Write a program to calculate sum of 5 subject’s marks & find percentage. 
*Take the obtained marks from user using Scanner class. 
*Output should be in this format [ percentage marks = 99 % ]. 
*Use concatenation operator here.
*/

import java.util.Scanner;

class A3{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int marks[] = new int[5];
		int sum=0;
		
		for(int i=0; i<marks.length; i++){
			System.out.print("Enter marks of Subject " + (i+1) + ": ");
			marks[i] = sc.nextInt();
			sum += marks[i];
		}
		
		double percent = sum/(double)marks.length;
		
		System.out.println("Percenetage marks = " + percent + " %");
	
	}


}