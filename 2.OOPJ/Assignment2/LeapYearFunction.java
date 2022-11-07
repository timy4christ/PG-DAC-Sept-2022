// function returns true if its leap year

import java.util.Scanner;

class LeapYearFunction{
	
	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year : ");
		int year = sc.nextInt();
		
		System.out.println( isLeapYear(year) ? "True" : "False" );		
		
	}
	

	public static boolean isLeapYear(int year){
		
		if( year % 400 == 0 )
			return true;
		
		else if( year % 100 != 0 && year % 4 == 0 )
			return true;
			
		else	
			return false;
	}
	
}