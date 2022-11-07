class LabeledLoop{

	public static void main(String[] args){
	
		outerloop: for(final int i=1; i<=5;){
			
			innerloop: for(final int j=1; j<=5;){

				if(i == j) 
					break outerloop;
				System.out.println(i + "," + j);
				
			}
			
			System.out.println("Out of inner Loop");		
		} 
		System.out.println("Out of outer Loop");
	
	}
}