/*
 Create a class Book with 3 private data members:
-bid
-subject
-author
 */

public class Book implements Comparable<Book>
{
    //Declaring Private variable
	private int bid;
	private String subject;
	private String author;
	
    //Parameterized constructor
	public Book(int bid, String subject, String author) 
	{
		super();
		this.bid = bid;
		this.subject = subject;
		this.author = author;
	}
	
	public final int getBid() {
		return bid;
	}

	public final void setBid(int bid) {
		this.bid = bid;
	}

	public final String getSubject() {
		return subject;
	}

	public final void setSubject(String subject) {
		this.subject = subject;
	}

	public final String getAuthor() {
		return author;
	}

	public final void setAuthor(String author) {
		this.author = author;
	}
     //Override toString method 
	public String toString() {
		return "Book [bid=" + bid + ", subject=" + subject + ", author=" + author + "]";
	}
    //Override compareTo method
	
	public int compareTo(Book o) {
		return this.author.compareTo(o.getAuthor());
	}
	
}