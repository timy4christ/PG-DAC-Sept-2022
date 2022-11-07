class P5{
	public static void main(String[] args){
		
		int n=9;

		for(int i=1; i<=n; i++){
			
			// spaces
			for(int j=n-i; j>=1; j--){
				System.out.print("  ");
			}
			
			// prints
			for(int j=n-i+1; j<n; j++){ // removed the last colm here
				System.out.print(j + " ");
			}
			
			for(int j=n; j>=n-i+1; j--){
				System.out.print(j + " ");
			} 
			
			System.out.println();
			
		}

	}
}