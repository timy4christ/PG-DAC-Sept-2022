/*
* Create a class MathOperation that has four static methods. 
* add() method that takes two integer numbers as parameter and returns the sum of the numbers. 
* subtract() method that takes two integer numbers as parameter and returns the difference of the numbers. 
* multiply() method that takes two integer numbers as parameter and returns the product.
* power() method that takes two integer numbers as parameter and returns the power of first number to 
second number. 
* Create another class Demo (main class) that takes the two numbers from the user and calls all four methods of MathOperation class by providing entered numbers and prints the return values of every method.
*/
import java.util.Scanner;

class A7{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter first number : ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();
		
		int sum = MathOperation.add(num1, num2);
		int diff = MathOperation.subtract(num1, num2);
		int product = MathOperation.multiply(num1, num2);
		int power = MathOperation.power(num1, num2);
		
		System.out.println("\nSum of " + num1 + " and " + num2 + " is : " + sum);
		System.out.println("Difference of " + num1 + " and " + num2 + " is : " + diff);
		System.out.println("Product of " + num1 + " and " + num2 + " is : " + product);
		System.out.println("Power of " + num1 + " to " + num2 + " is : " + power);
	}
}

class MathOperation{

	static int add(int num1, int num2){
		return num1 + num2;
	}
	
	static int subtract(int num1, int num2){
		return num1 - num2;
	}
	
	static int multiply(int num1, int num2){
		return num1 * num2;
	}
	
	static int power(int num1, int num2){
		return (int)Math.pow(num1, num2);
	}
}