class P18 {
    public static void main(String[] args) {

        int n = 5;
						
        for (int i = 1; i <= n; i++) {
			
			for(char j='A'; j<='E'-i+1; j++){
				System.out.print((char)j + " ");
			}
			
            System.out.println();
        }
    }
}