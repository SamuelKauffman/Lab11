package Lab11;

public class Publisher {
	String name;
	String city;
	String publisherID;
	Author author;
	Book book;
Publisher(String name, String city, String publisherID, Author author, Book book){
	this.name=name;
	this.city=city;
	this.publisherID=publisherID;
	this.author=author;
	this.book=book;
}
public static void main(String[] args) {
	Author a = new Author("Stephen King","1234 Street",54);
	Book b = new Book("The Institute",30);
	Publisher p = new Publisher("Stoney Brook","Louisville","12STV4",a,b);
		System.out.println("Book name: " + b.name);
		System.out.println("Author name: " + a.name);
		System.out.println("publisher name: " + p.name);
}
}
