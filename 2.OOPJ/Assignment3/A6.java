/*
* Write a class Box that with three member-variables height, width and breadth. 
* Write suitable constructors to initialize them. 
* Add functions like getVolume and getArea that will return volume and surface area respectively. 
* Instantiate two arbitrary boxes and then print their volume and surface area.
*/

class A6{
	public static void main(String[] args){
		Box b1 = new Box(23.5,15.6,45.2);
		Box b2 = new Box(5,20,15);
		
		System.out.println("\nVolume of Box1 : " + b1.getVolume());
		System.out.println("Surface Area of Box1 : " + b1.getSurfaceArea());
		
		System.out.println("\nVolume of Box2 : " + b2.getVolume());
		System.out.println("Surface Area of Box2 : " + b2.getSurfaceArea());
	}
}

class Box{

	double height;
	double width;
	double breadth;
	
	Box(){
		height = 0;
		width = 0;
		breadth = 0;
	}
	
	Box(double h, double w, double b){
		height = h;
		width = w;
		breadth = b;
	}
	
	double getVolume(){
		return height * width * breadth;	
	}
	
	double getSurfaceArea(){
		double surfArea = 2 * ( (width * breadth) + (breadth * height) + (width * height) );
		return surfArea;
	}
}