/*
* Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. Here’s what the class should do:

* Construct a class called Patient

* Store a String name for the patient

* Store weight and height for patient as doubles

* Construct a new patient using these values

* Write a method called BMI which returns the patient’s BMI as a double. 

*BMI can be calculated as BMI = ( Weight in Pounds / ( Height in inches x Height in inches ) ) x 703

* Next, construct a class called “Patients” and create a main method. 

* Create a Patient object and assign some height and weight to that object. Display the BMI of that patient.
*/


import java.util.Scanner;

class A3{
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		Patient patient1 = new Patient();
		System.out.print("Enter the name of patient: ");
		patient1.name = sc.nextLine();
		
		System.out.println("Enter weight and height of Patient");
		System.out.print("Weight(in kg) = ");
		patient1.weight = sc.nextDouble();

		System.out.print("Height(in meters) = ");
		patient1.height = sc.nextDouble();
		
		System.out.println("The BMI of " + patient1.name + " is: " + patient1.getBMI());

	}

}

class Patient{

	String name;
	double weight;
	double height;
	
	Patient(){
		System.out.println("New Patient record");
	}
	
	double getBMI(){
		double bmi = (weight / (height * height)); //for metric system
		return bmi;
	}
	
}