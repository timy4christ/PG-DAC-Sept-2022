// try making a library set up: data members and methods in the bottom


import java.util.Scanner;

class Book{

	String title;
	String author;
	long isbn;
	double price;
	static int counter;
	
	
	Book(){
		counter++;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		Book b1 = new Book();
		Book b2 = new Book();

		//Book 1 info
		b2.title="We free the Stars";
		b2.author="Hafsah Faizal";
		b2.isbn=374311579;
		
		// Book2 Info
		b1.title="One giant leap";
		b1.author="Heather Kaczynski";
		b1.isbn=62479946;
		
		
		System.out.println("\n1. Available Books List");
		System.out.println("2. Issue Book");
		System.out.println("3. Return Book\n");
		
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		
		switch(choice) {
			
			case 1:
				if(counter == 0)
					System.out.println("No Books Available");
				else
					showBooks(b1,b2);
				break;
				
			case 2:
				//issueBook();
				break;
				
			case 3:
				//returnBook();
				break;
			
			default:
				System.out.println("Invalid Entry");
			
			
		}
		
		//showbooks();
/*		
		System.out.println(b1.title);
		System.out.println(b1.author);
		System.out.println(b1.isbn);

		System.out.println(b2.title);
		System.out.println(b2.author);
		System.out.println(b2.isbn);
*/			
		
	}
	
	public static void showBooks(Book b1, Book b2){
		
		
	}

}

/*

// data members
book title
book author
bookid


// methods
list books available
issue
return
purchase



*/
