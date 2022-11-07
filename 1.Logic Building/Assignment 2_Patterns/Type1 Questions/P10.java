class P10 {
    public static void main(String[] args) {

        int n = 5;
		char alpha = 'E';
		
        for (int i = 1; i <= n; i++) {
			
			for(int j = n-i; j>=1; j--){
				System.out.print(" ");
			}
			
			for(int j = alpha-i+1; j <= alpha; j++){
				System.out.print((char)j + " ");
			} 
			
            System.out.println();
        }
    }
}