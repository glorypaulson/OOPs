/*You are tasked with creating a library management system for a university. The system should be able to handle books, journals, and magazines. Each item in the library has a title, author, and a unique identifier.

Start by creating a base class called "LibraryItem" that has the common attributes and methods for all library items:
Attributes:

title (String)
author (String)
id (int)
Methods:

getters and setters for all attributes
displayItemInfo() - a method that prints the details of the item
Create three subclasses: "Book", "Journal", and "Magazine" that inherit from the "LibraryItem" class.
Each subclass should have additional unique attributes and methods specific to that item type. 
For example, a "Book" class can have attributes like "genre" and "numPages", a "Journal" class can have attributes 
like "publisher" and "issueNumber", and a "Magazine" class can have attributes 
like "category" and "publicationFrequency".

Each subclass should also override the displayItemInfo() method to print the specific details of that item type.

Create a class called "Library" that acts as the main interface for the library management system. It should have the following methods:
addItem() - a method that takes an instance of the base class "LibraryItem" and adds it to the library collection.
displayAllItems() - a method that displays the details of all the items in the library.
Write a program that demonstrates the functionality of the library management system. Create instances of 
each item type, add them to the library, and then display the details of all the items.
This problem incorporates encapsulation by encapsulating the attributes and methods within classes. 
Inheritance is used to create subclasses that inherit and extend the base class. Polymorphism is shown 
through the overriding of the displayItemInfo() method in the subclasses. 
Abstraction is achieved by creating the base class as an abstract representation of a library item.*/

import java.util.ArrayList;
import java.util.List;

class LibraryItem{
	private String title;
	private String author;
	private int id;
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getId() {
		return id;
	}
	public void displayItemInfo() {
		System.out.println("Book Title: " +title+ ", Book Author: "+author+", Book ID: "+id);
	}
}
class Book extends LibraryItem{
	private String genre;
	private int numPages;
	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	public void displayItemInfo() {
		super.displayItemInfo();
		System.out.println("Book Genre: "+genre+", Number of Pages: "+numPages);
	}
}
class Journal extends LibraryItem{
	private String publisher;
	private int issueNumber;
	
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(int issueNumber) {
		this.issueNumber = issueNumber;
	}

	public void displayItemInfo() {
		super.displayItemInfo();
		System.out.println("Journal Publisher: "+publisher+", Issue Number: "+issueNumber);
		
	}
}
class Magazine extends LibraryItem{
	private String category;
	private int publicationFrequency;
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPublicationFrequency() {
		return publicationFrequency;
	}

	public void setPublicationFrequency(int publicationFrequency) {
		this.publicationFrequency = publicationFrequency;
	}
    
	public void displayItemInfo() {
		super.displayItemInfo();
		System.out.println("Magazine Category: "+category +", Publication Frequency: "+publicationFrequency);
		
	}
}


class Library{
	private ArrayList<LibraryItem> lib;
	
	public ArrayList<LibraryItem> getLib() {
		return lib;
	}
	public Library() {
		lib = new ArrayList<>();
	}
	public void addItem(LibraryItem li) {
		lib.add(li);
	}
	public void displayAllItems() {
		for (LibraryItem libraryItem : lib) {
			libraryItem.displayItemInfo();
			System.out.println();
		}
	}
}


public class LibraryManagement {

	public static void main(String[] args) {
		
		Book book = new Book();
		book.setAuthor("William Shakspeare");
		book.setTitle("Merchant of Venice");
		book.setId(1);
		book.setGenre("Romance ");
		book.setNumPages(300);
		
		
		Magazine magazine = new Magazine();
		magazine.setId(2);
		magazine.setAuthor("IEEE Journals");
		magazine.setTitle("The Night");
		magazine.setCategory("Business ");
		magazine.setPublicationFrequency(10);
		
		Journal journal = new Journal();
		journal.setId(3);
		journal.setAuthor("Harshitha KR");
		journal.setTitle("Carnatic Raga Identification");
		journal.setPublisher("Glory Paulson ");
		journal.setIssueNumber(15);
		
		Library library = new Library();
		library.addItem(magazine);
		library.addItem(journal);
		library.addItem(book);
		library.displayAllItems();
	}

}
