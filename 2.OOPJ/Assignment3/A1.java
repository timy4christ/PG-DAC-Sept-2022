/*
* Implement a class for a “Book”. 
* Book contains a title (a String), a list of authors (array of authors), number of pages (an integer), price (floating point number), publisher (a String) etc.
* Write suitable constructor and accessor/modifier methods. 
* Implement a class for “Library”. 
* A library contains a list of books (array of Book). 
* Write add (to add a book) and remove (to delete a book) methods for library. 
* Write a main() function to create a “Library” and add five “Book” to library.
* Print the total price of all books.
*/



import java.util.Scanner;


class A1{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		Library lib = new Library();
		
		while(true) {
			System.out.println("\n1.Add Books");
			System.out.println("2.Remove Books");
			System.out.println("3.Print Book Lists");
			System.out.println("4.Exit");
			
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice){
			
				case 1:
					lib.addBook();
					break;
					
				case 2:
					lib.removeBook();
					break;
			
				case 3:
					lib.displayBooks();
					break;
					
				case 4:
					System.exit(0);
					
				default:
					System.out.println("Invalid Entry");
			}
		}
	}
}

class Library{

	Book[] bookList;
	static int count; // to count the number of books currently present in the bookList
	
	Library(){
		System.out.println("\n------------New Library Created-----------");
		bookList = new Book[3]; // 3: max possible books in the Library
		count = 0;
	}
	
	void displayBooks(){
		if(count == 0){
			System.out.println("\n-----------------Library Empty-----------------");
		}
		else
			for(int i=0; i < count; i++)
				bookList[i].getDetails(count);
		
	}
	
	void addBook(){
		if(count == 3){
			System.out.println("\n---------------Library Full-----------------");
		}
		else
			bookList[count++] = new Book();
	}
	
	void removeBook(){
		if(count == 0){
			System.out.println("\n-----------------Library Empty-----------------");
		}
		else{
			System.out.println("\n-----------Book " + count + " removed-----------"); // removes in stack format
			count--; //just stimulating the deletion of object	
		}
	}
}

class Book{
	
	String title;
	int numOfAuthors;
	String[] author;
	double price;
		
	Book(){
		setTitle();
		author = new String[3]; // 3: maximum possible authors of one book
		setAuthor();
		setPrice();
	}
	
	void setTitle(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the title of book: ");
		title = sc.nextLine();
	}
	
	void setAuthor(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of authors (max 3): ");
		numOfAuthors = sc.nextInt(); 
		sc.nextLine(); // to clear buffer
		
		System.out.println("Enter the authors of the book: ");
		
		for(int i=0; i < numOfAuthors; i++)
			author[i] = sc.nextLine();	
		
		
	}
	void setPrice(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the price of book: ");
		price = sc.nextDouble();
	}
	
	void getDetails(int count){	
		System.out.println("\n----------------Book " + count + " Details---------------");
		System.out.println("Book Title: " + title);
		for(int i=0; i < numOfAuthors; i++){
			System.out.println("Author " + (i+1) + ": " + author[i]);
		}
		System.out.println("Book Price: Rs." + price);
		System.out.println("-------------------------------------------");
	}
}


