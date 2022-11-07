// smallest of three numbers

class A1_11 {
	public static void main(String[] args) {
	
		int a = 35;
		int b = 25;
		int c = 5;	
		
		System.out.println("\nNumbers for comparision are : " + a + ", " + b + ", " + c);
		
		if ( a < b && a < c )
			System.out.println("Smallest : " + a);
		
		else if ( b < c ) 
			System.out.println("Smallest : " + b);
		
		else
			System.out.println("Smallest : " + c);
	}
}