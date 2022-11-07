class P5{
	public static void main(String[] args){
		
		int n=5;
		
		for(int i=1; i<=n; i++){
			
			//space
			for(int j=n-i; j>=1; j--){
				System.out.print(" ");
			}
			
			//star
			
			//left half of pyramid
			// removing last column to merge them
			for(int j=1; j<i; j++){
				System.out.print("*");
			}
			
			// right half of pyramid
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}	
		
			System.out.println();
		
		}
		
		System.out.println("Another logic for stars:");
		
		for(int i=1; i<=n; i++){
			
			//space
			for(int j=n-i; j>=1; j--){
				System.out.print(" ");
			}
			
			//star

			for(int j=1; j<=2*i-1; j++){
				System.out.print("*");
			}
		
			System.out.println();
		
		}

	}
}