// function to print breakdown of integer
// eg 43018
// 40000+3000+10+8

import java.util.Scanner;

class IntegerBreakdownFunction {
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		int count = countDigits(num);
		displayBreakdown(num, count);

	}

	public static int countDigits(int num){
	
		int count=0;
		
		while(num != 0){
			count++;
			num /= 10;
		}
		
		return count; 
	}

	public static void displayBreakdown(int num, int count){
	
		int reversedNum = reverseNum(num); //reversed Number
		int extNum=0; //extracted Number
		int digit=0;
		int temp = reversedNum;
		
		for(int i=count-1; i>=0; i--){
			
			digit = temp % 10;
			extNum = digit * (int)Math.pow(10,i);
			temp /= 10;
			
			System.out.print(extNum + "+" );
		}
		
		System.out.println("\b ");
		
	}
	
	public static int reverseNum(int num){
	
		int reverse = 0;
		int digit;
		
		while(num != 0 ){
		
			digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;
		}
		
		return reverse;
		
	}
	

}








