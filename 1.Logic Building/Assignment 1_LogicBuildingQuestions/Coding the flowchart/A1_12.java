// adding two numbers without arithmetic operators : &, ^, << (bitshifting operators)

class A1_12 {
	public static void main(String[] args) {
	
		int a = 120;
		int b = 33;
		int carry;
		
		System.out.println("\nThe numbers are : " + a + ", " + b); 
		
		do {
			
			carry = a & b; // & operator takes care of/ decides the carry needed
			a = a ^ b; // simulates running addition as in actual binary addition
			b = carry << 1; // since carries are from one place to left from where it has been discovered
			
		}while( carry != 0 ); 
			
		System.out.println("Sum : " + a);
	}
}

