/*
* Implement a class for "DateDemo". 
* Write member functions for 
* (i) getting the previous day, 
* (iv) getting the next day, 
* (iii) printing a day.
* There should be four constructors: 
* (i) day, month and year are initialized to 01, 01, 1970; 
* (ii) day is initialized to user specified value but month and year are initialized to 01, 1970; 
* (iii) day, month are initialized to user specified value but year is initialized to 1970; 
* (iv) day, month and year are initialized to user defined values. 
* Also, write a main() function to 
* (i) create a date object; 
* (ii) print the next and the previous day.
*/

import java.util.Scanner;

class DateDemo{
	int day;
	int month;
	int year;
	
	DateDemo(){
		this.day = 1;
		this.month = 1;
		this.year = 1970;
	}
	
	DateDemo(int day){
		this();
		this.day = day;
	}
	
	DateDemo(int day, int month){
		this(day);
		this.month = month;
	}
	
	DateDemo(int day, int month, int year){
		this(day, month);
		this.year = year;
	}
	
	int getMaxOfMonth(int month){ // returns end of the month
		
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
			return 31;
		} 
		
		else if(month==2){ // returns according to leap year condition
			if(year%400==0)
				return 29;
			else if(year%100!=0 && year%4==0)
				return 29;
			else
				return 28;
		} 
		
		else { 
			return 30;
		}	
	}
	
	String getPrevDate(){
		int prevDay = 31;
		int month = this.month;
		int year = this.year;
		
		if(month==1){  // considering the start of a year
			prevDay = 31;
			month = 12;
			year--;
		} 
		
		else { 
			if(day==1){ //checking both end condition of each month
				month--;	
				prevDay = getMaxOfMonth(month);
			} 
			
			else {
				prevDay = day - 1;
			}
		}
		
		String prevDate = prevDay + "/" + month + "/" + year;
		
		return prevDate ;
	}
	
	String getNextDate(){
		
		int nextDay = 1;
		int month = this.month;
		int year = this.year;
		
		if(month==12){  // considering the end of year
			nextDay = 1;
			month = 1;
			year++;
		}
		
		else {
			if(day==getMaxOfMonth(this.month)){ //checking both end condition of each month
				month++;
				nextDay = 1;
			} 
			
			else {
				nextDay = day + 1;
			}			
		}
		
		String nextDate = nextDay + "/" + month + "/" + year;
		
		return nextDate;
	}
	
	void printDate(){
		System.out.println("\nPrevious Date: " + getPrevDate());
		System.out.println("Next Day: " + getNextDate());
	}
}

class A2{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the day: ");
		int day = sc.nextInt();
		
		System.out.print("Enter the month: ");
		int month = sc.nextInt();
		
		System.out.print("Enter the year: ");
		int year = sc.nextInt();
		
		// validation of correct date
		
		DateDemo dobj = new DateDemo(day, month, year);
		
		dobj.printDate();
		
		// System.out.println();
	}
}