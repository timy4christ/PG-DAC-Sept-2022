// LCM of two numbers

class A1_15 {
	public static void main(String[] args) {
	
		int a = 75;
		int b = 25;
		
		int i = 2;

		int temp = b; 
		
		System.out.print("\nThe numbers in comparison are : " + a + ", " + b);
		
		while ( temp % a != 0 ){
			temp = b;			
			temp *= i;
			i++;
		}	
		
		System.out.println(); // just to give seperation
		
		System.out.println("LCM : " + temp);
	
	}
}

