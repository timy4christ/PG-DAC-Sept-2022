import java.util.Scanner;

class HW2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number : ");
        int num = sc.nextInt();

        if ( num == 1 ) {
            System.out.println("1 is neither prime nor composite");
        } 
		
		else if ( num <= 0 ) {
            System.out.println("Number is not positive");
        } 
		
		else {
            int i = 2;
			
			boolean isPrime = true;
            
			for( i = 2; i <= (num / 2); i++) {
                if ( num % i == 0 ) {
                    isPrime = false;
                    break;
                }
            }
            
			// prime, not prime
            
			System.out.println(isPrime ? "Prime Number" : "Not Prime");
        }
    }
}
