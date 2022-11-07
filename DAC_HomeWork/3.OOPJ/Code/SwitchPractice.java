class SwitchPractice{
	public static void main(String[] args){
	
		char choice = 'A';
		
		switch(choice){
		
			case 'a':
			case 'A':
				System.out.println("choice '" + choice + "' selected");
				break;
			
			default:
				System.out.println("Invalid Entry");
					
		}
		
		System.out.println("Out of switch block");
	}

}