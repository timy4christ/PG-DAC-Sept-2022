class P13{
	public static void main(String[] args){
		
		int n=5;
		
		//upper half
		for(int i=1; i<n; i++){ // reduced one row here
			
			for(int j=i-1; j>=1; j--){
				System.out.print(" ");
			}
			
			for(int j=n-i+1; j>=1; j--){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//lower half
		for(int i=1; i<=n; i++){
			
			for(int j=n-i; j>=1; j--){
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}