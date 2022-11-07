/*
* Create an abstract class Publication with data members noOfPages, price, publisherName etc. 
* with their accessor/modifier functions. 
* Now create two sub-classes Book and Journal. 
* Create a class Library that contains a list of Publications. 
* Write a main() function and create three Books and two Journals, add them to library and print the details of all publications.
*/


class Publication{
	int noOfPages;
	double price;
	String pubName;
}

class Book extends Publication{
	
}

class Journal extends Publication{
	
}

class Library{
	List<Publication> pub1;
	
	public Library(){
		pub1 = new ArrayList();
	}
	
	public static void main(String[] args){
		Library lib = new Library();
	}
}
