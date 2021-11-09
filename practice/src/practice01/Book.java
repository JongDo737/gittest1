package practice01;

public class Book {

	int id;
	String name;
	String author;
	public Book(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println("id : "+id);
		System.out.println("name : "+name);
		System.out.println("author : "+author);
	}
}
