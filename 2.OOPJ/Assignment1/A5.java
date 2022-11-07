/* Write a program to read the days (eg. 670 days) as integer value using Scanner class. 
* Now convert the entered days into complete years, months and days and print them.
*/
import java.util.Scanner;

class A5{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of days: ");
		int days = sc.nextInt();
		
		// complete years
		int completeYears = days/365;
		
		// complete months
		int completeMonths = 12 * (days%365)/365;
		
		// remaining days 
		int remainingDays = (12 * (days%365)/365) % 365;
		
		System.out.println(days + " is " + completeYears + " years, " + completeMonths + " months, " + remainingDays + " days");
	
	}


}