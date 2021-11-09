package practice02;

public class Book {

	int bookId;
	String name;
	String author;
	
	public Book(int bookId, String name, String author) {
		this.bookId = bookId;
		this.name = name;
		this.author = author;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+ author;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Book) {
			if(((Book) obj).name == this.name && ((Book)obj).author == this.author){
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
}
