class P2 {
    public static void main(String[] args) {

        int n = 5;
		char alphabet = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(alphabet++ + " ");
            }
			alphabet = 'A';
            System.out.println();
        }
    }
}