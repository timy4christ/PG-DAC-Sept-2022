/* 
*In a company an employee is paid as under: 
*If his basic salary is less than Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic salary. 
* If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary. 
* If the employee's salary is input by the user write a program to find his gross salary. 
*[ formula : GS= Basic + DA + HRA ]
*/

import java.util.Scanner;

class A8{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your basic salary: ");
		int basicSalary = sc.nextInt();
		
		double hra;
		double da;
		
		if (basicSalary < 10000 && basicSalary >= 0){
			hra = 0.1 * basicSalary;
			da = 0.9 * basicSalary;
		}
		
		else{
			hra = 2000;
			da = 0.98 * basicSalary;			
		}
		
		double grossSalary = basicSalary + hra + da;
		
		System.out.println("Your gross salary is : Rs." + grossSalary);
			
	}


}