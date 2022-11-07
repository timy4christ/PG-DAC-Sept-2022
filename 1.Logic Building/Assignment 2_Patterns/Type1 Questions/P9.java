class P9 {
    public static void main(String[] args) {

        int n = 5;
		char alphabet = 'A';
		
        for (int i = n; i >= 1; i--) {
			
			for(int j=i-1; j>=1; j--){
				System.out.print(" ");
			}
			for(int j=1; j<=n-i+1; j++){
				System.out.print(alphabet++ + " ");
			}
			alphabet='A';
			
            System.out.println();
        }
    }
}