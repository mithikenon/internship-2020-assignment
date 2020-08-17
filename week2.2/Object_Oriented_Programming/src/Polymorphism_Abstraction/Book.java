package Polymorphism_Abstraction;

public class Book {
	private String bookname;
	private String author;
	private double price;
	private int qty;
	private String booklink;
	
	
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getBooklink() {
		return booklink;
	}
	public void setBooklink(String booklink) {
		this.booklink = booklink;
	}
	public String toString() {
		return "'"+bookname+"'"+"by"+author;
	}
	
}	
 class TestBook{
	public static void main(String[] args) {
		
	Book book=new Book(); 
		
		book.setBookname("HTML & CSS:Design and Build Websites");
		book.setAuthor("Jon Duckett");
		book.setPrice(13.79);
		book.setQty(1);
		book.setBooklink("books.google.com");
		
		System.out.println("BookName: "+book.getBookname());
		System.out.println("BookPrice: "+book.getPrice());
		System.out.println("Quality: "+book.getQty());
		System.out.println("BookLink: "+book.getBooklink());
		
		
	}
	
	public void Order(String bookorder) {
		System.out.println("Choose Book");
		System.out.println("Please tell address and phone");
					
	}
 }
 


