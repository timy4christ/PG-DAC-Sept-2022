// print 1 to 10 without using loop

class A1_7 {
	public static void main(String[] args) {
		
		int n = 1;
		
		printNum(n);
		
	}
	
	public static int printNum(int n){
		if(n>10)
			return 1;
		
		else {
			System.out.print(n + " ");
			return printNum(n+1);
		}
	}
}