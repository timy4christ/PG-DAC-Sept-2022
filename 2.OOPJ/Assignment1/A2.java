import java.util.Scanner;

class A2{
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Area of Circle");
		System.out.println("2.Circumference of Circle");
		
		System.out.print("Enter you choice: ");
		int choice = sc.nextInt();
		
		System.out.print("Enter the radius of the circle: ");
		double radius = sc.nextDouble();
		
		if(choice == 1)
			System.out.println("Area is : " + getArea(radius));
		
		else if(choice == 2)
			System.out.println("Circumference is : " + getCircumference(radius));
		
		else
			System.out.println("Invalid Entry");

	}
	
	public static double getArea(double radius){
	
		return Math.PI * radius * radius;
	
	}
	
	public static double getCircumference(double radius){
	
		return 2 * Math.PI * radius;
	
	}
	


}