import java.util.*;

class DoWhilePratice{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		do{
			
			System.out.println("1. Print Hello");
			System.out.println("2. Print Bye");
			System.out.println("3. Exit");

			System.out.print("Enter you choice : ");
			choice = sc.nextInt();
		
		}while(choice != 3);
	
		System.out.println("Thank you for using our Application");
	}

}