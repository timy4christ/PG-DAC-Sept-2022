import java.util.Scanner;

class CricketerInfo{
	
	// static Player p[] = new Player[10];
	
	public static void main(String[] args){
		
		Player p[] = new Player[10];
		Scanner sc = new Scanner(System.in);
		
		// some variables that are required
		boolean objectCreated = false;
		
		
		do{
		
			// Initial List to choose from
			System.out.println("\n1. Add Player Info");
			System.out.println("2. Player Information");
			
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
		
			switch(choice){
				
				case 1 : 
					objectCreated = true;
					System.out.print("How many players do you want to add :");
					choice = sc.nextInt();
					
					for(int i=0; i<choice; i++) {
						System.out.print("\nPlayer " + (i+1));
						
						p[i] = new Player();
						p[i].addName();
						p[i].addDOB();
						p[i].addBirthPlace();
						p[i].addPlaysFor();
					}
					// System.out.println(p[0].name);
					break;
				
				case 2 : 
						for(int i=0; i<1; i++){
							p[i].playerList();
						}
						
						// playerList(); 
						System.out.print("Whose Info do you want to see : ");
						choice = sc.nextInt();
						break;
				default:
					System.out.println("Invalid Entry");
			}
			
			// System.out.print("Do you want to continue(Y|N) : ");
			// exitCondition = sc.next().chatAt(0);
			
		}while(true);
	}
	/*
	static void playerList(){
		System.out.println("Player Info Available");
		
		for(int i=0; i<p.length; i++){
			System.out.println( i+1 + ". " + p[i]);
		}
	}*/
}

class Player{
	String name;
	String dob;
	String birthPlace;
	String playFor;
	
	Scanner sc = new Scanner(System.in);
	
	void addName(){
		System.out.print("\nEnter name : ");
		name = sc.nextLine();
		// sc.nextLine();
	}
	void addDOB(){
		System.out.print("\nEnter Date of Birth(dd-mm-yyyy) : ");
		dob = sc.nextLine();
		// sc.nextLine();
	}
	void addBirthPlace(){
		System.out.print("\nEnter Birth Place : ");
		birthPlace = sc.nextLine();
	 	// sc.nextLine();
	}
	void addPlaysFor(){
		System.out.print("\nEnter country the Player plays for : ");
		playFor = sc.nextLine();
		// sc.nextLine();
	}
	
	void playerList(){
		System.out.println("Player Info Available");
		
		System.out.println(this.name);
		
	}
	
}