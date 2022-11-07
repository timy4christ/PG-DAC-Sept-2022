/*
* Create a class Box that uses a parameterized method to initialize the dimensions of a box.
* (dimensions are width, height, depth of double type). 
* The class should have a method that can return volume. 
* Obtain an object and print the corresponding volume in main() function.
*/

class A1{
	
	public static void main(String[] args){
	
		Box box1 = new Box();
		box1.setDimensions(3.3,4.8,6.1);
		
		System.out.println("Volume of box is: " + box1.getVolume());
	
	}

}

class Box{
	
	double width;
	double height;
	double depth;
	
	Box(){
		System.out.println("\nBox has been created");
	}	
	
	void setDimensions(double width, double height, double depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	double getVolume(){
		return width * height * depth; 
	}

}