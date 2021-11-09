package practice01;

import java.util.ArrayList;

public class BookArrayListMainTest {
//CRUD
	public static void main(String[] args) {
		Book[] book = new Book[5];

		book[0] = new Book(1, "�帣�� ����ó��", "�Ŀ���ڿ���");
		book[1] = new Book(2, "�÷���UI����", "���ȣ");
		book[2] = new Book(3, "����ȭ�����Ǿ����ϴ�", "������");
		book[3] = new Book(4, "�������� �����϶�", "������");
		book[4] = new Book(5, "���ǿ���", "�����϶�");

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
