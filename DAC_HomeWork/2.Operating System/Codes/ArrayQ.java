import java.util.Scanner;

class ArrayQ{
	public static void main(String[] agrs){
		
		Scanner sc = new Scanner(System.in);
		int a[] = new int[4];
		int b[] = new int[4];
		
		// input array
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		
		//operation
		for(int i=0; i<b.length; i++){
			
			b[i] = 1;
			for(int j=0; j<a.length; j++)
				if(i == j)
					continue;
				else
					b[i] *= a[j];
		
		}
		
		// printing the resultant array
		for(int i=0; i<b.length; i++){
			System.out.print(b[i] + " ");
		}
	}
}