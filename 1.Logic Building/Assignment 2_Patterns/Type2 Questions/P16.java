class P16 {
	public static void main(String[] args){
		
		int n=5;
		
		for(int i=1; i<=n; i++) {
			
			// spaces
			for(int j=n-i; j>=1; j--){
				System.out.print(" ");
			}
			
			// stars
			for(int j=1; j<=i; j++) {
				if(j==1 || j==i || i==5) {
					System.out.print("*");
				}
				
				else {
					System.out.print(" ");				
				}
			}
			System.out.println();
		}
	}
}