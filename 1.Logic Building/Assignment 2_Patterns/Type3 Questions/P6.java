class P6{
	public static void main(String[] args){
		
		int n=9;

		for(int i=1; i<=n; i++){
			
			for(int j=i-1; j>=1; j--){
				System.out.print(" ");
			}
			
			for(int j=n-i+1; j>=1; j--){
				System.out.print("* ");
			}
			
			System.out.println();
			
		}

	}
}