package practice02;

public class BookTest {

	public static void main(String[] args) {
		
		Book book1 = new Book(1, "��ó��", "������");
		Book book2 = new Book(2, "��ó��", "������");

		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book1.equals(book2));
		
	}

}
