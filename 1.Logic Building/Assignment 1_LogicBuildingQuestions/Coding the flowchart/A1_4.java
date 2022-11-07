// program to swap numbers without using third variable

class A1_4 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("\nBefore Swap : ");
		System.out.println("a = " + a + " b = " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("\nAfter Swap : ");
		System.out.println("a = " + a + " b = " + b);
			
	}
}