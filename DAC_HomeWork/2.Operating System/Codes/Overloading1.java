class Overloading1{
	public static void main(String[] args){
		
		Overloading1 obj = new Overloading1(); 
		
		System.out.println("\nBelow are examples of funtion overloading: ");
		
		obj.print(3,5);
		obj.print(3.5f,2.6f);
		obj.print(6.0,2.8,22.9);
		obj.print(8,5.0f,64.23);
		obj.print("Hey! This is a String");
	
	
	}
	
	void print(int x, int y){
		System.out.println("\nThe integers passed are : " + x + " and " + y);
	}
	
	void print(float x, float y){
		System.out.println("\nThe floating values passed are : " + x + " and " + y);
	}
	
	void print(double x, double y, double z){
		System.out.println("\nThe double values passed are : " + x + ", " + y + " and " + z);
	}
	
	void print(int x, float y, double z){
		System.out.print("\nThe integer passed is : " + x);
		System.out.print(", The float value passed is : " + y);
		System.out.println(", The double value passed is : " + z);
	}
	
	void print(String str){
		System.out.println("\nThe String passed is : " + str);
	}
}