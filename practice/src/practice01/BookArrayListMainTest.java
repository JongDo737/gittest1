package practice01;

import java.util.ArrayList;

public class BookArrayListMainTest {
//CRUD
	public static void main(String[] args) {
		Book[] book = new Book[5];

		book[0] = new Book(1, "흐르는 강물처럼", "파울로코엘료");
		book[1] = new Book(2, "플러터UI실전", "김근호");
		book[2] = new Book(3, "무궁화꽃이피었습니다", "김진명");
		book[3] = new Book(4, "리딩으로 리드하라", "이지성");
		book[4] = new Book(5, "사피엔스", "유발하라리");

		ArrayList<Book> shoppingCart = new ArrayList<Book>();

		shoppingCart.add(book[1]);
		shoppingCart.add(book[2]);
		shoppingCart.add(book[0]);
		shoppingCart.add(book[4]);

		for (Book book2 : shoppingCart) {
			if (book2 != null) {
				book2.showInfo();
			}
		}
		System.out.println("=========");
		shoppingCart.add(2,book[3]);
		for (Book book2 : shoppingCart) {
			if (book2 != null) {
				book2.showInfo();
			}
		}
		System.out.println("=========");
		//update
		shoppingCart.set(1, book[1]);
		
		//Delete
		shoppingCart.remove(3);
		for (Book book2 : shoppingCart) {
			if (book2 != null) {
				book2.showInfo();
			}
		}
		System.out.println("=========");
		shoppingCart.clear();
	}

}
