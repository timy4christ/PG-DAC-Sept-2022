class P4{
	public static void main(String[] args){
		
		int n=9;

		for(int i=1; i<=n; i++){
			
			//spaces
			for(int j=n-i; j>=1; j--){
				System.out.print("  ");
			}
			
			//prints
			for(int j=1; j<i; j++){ // removed last colm from here
				System.out.print(j + " ");
			}
			
			for(int j=i; j>=1; j--){
				System.out.print(j + " ");
			}
			
			System.out.println();
			
		}

	}
}