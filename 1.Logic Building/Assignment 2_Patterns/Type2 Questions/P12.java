class P12{
	public static void main(String[] args){
		
		int n=5;
		
		// upper pattern
		for(int i=1; i<n; i++){ // removing last row from here 
			
			for(int j=1; j<=n-i+1; j++){
				System.out.print("*"); 
			}
			
			System.out.println();
		
		}
		
		//lower pattern
		for(int i=1; i<=n; i++){
			
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}