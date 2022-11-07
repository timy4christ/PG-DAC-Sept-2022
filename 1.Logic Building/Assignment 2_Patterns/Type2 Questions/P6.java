class P6{
	public static void main(String[] args){
		
		int n=5;
		
		for(int i=n; i>=1; i--){ // starting from n
			
			//spaces
			for(int j=n-i; j>=1; j--){
				System.out.print(" ");
			}
			
			// stars
			for(int j=n-i+1; j<n; j++){
				System.out.print("*");
			}
			
			for(int j=i; j>=1; j--){
				System.out.print("*");
			}
		
			System.out.println();
		
		}
		
		System.out.println("Another method to solve :");
		
		for(int i=1; i<=n; i++){ // starting from 1
			
			//spaces
			for(int j=i-1; j>=1; j--){
				System.out.print(" ");
			}
			
			// stars
			for(int j=1; j<n-i+1; j++){
				System.out.print("*");
			}
			
			for(int j=n-i+1; j>=1; j--){
				System.out.print("*");
			}
		
			System.out.println();
		
		}

	}
}