/*Write a program to convert temperature from Fahrenheit to Celsius. 
* Take Fahrenheit as input using Scanner class. 
* [ formula : C= 5*(f-32)/9 ]
*/

import java.util.Scanner;

class A6{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit: ");		
		int fahrTemp = sc.nextInt();
		
		double celTemp = 5.0/9.0 * (fahrTemp - 32);

		System.out.println("Temperature in Celsius: " + celTemp);
		
	
	}

}