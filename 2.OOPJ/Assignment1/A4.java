/*Write a program to find the simple interest.
* Take the principle amount, rate of interest and time from user using Scanner class.
*/

import java.util.Scanner;

class A4{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the principle amount: ");
		int principleAmount = sc.nextInt();
		
		System.out.print("Enter the rate of interest: ");
		double roi = sc.nextDouble();
		
		System.out.print("Enter the time: ");
		int time = sc.nextInt();
	
		double simpleInterest = principleAmount * roi * time / (double)100;
		
		System.out.println("Simple Interest is : " + simpleInterest);

	}

}