package practice02;

public class BookTest {

	public static void main(String[] args) {
		
		Book book1 = new Book(1, "정처기", "신종민");
		Book book2 = new Book(2, "정처기", "신종민");

		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book1.equals(book2));
		
	}

}
