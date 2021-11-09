package ch02;

import java.util.ArrayList;

import ch01.Book;

public class ArrayMainTest1 {
	public static void main(String[] args) {
		Book book1 = new Book(1, "�帣�� ����ó��", "�Ŀ���ڿ���");
		Book book2 = new Book(2, "�÷���UI����", "���ȣ");
		Book book3 = new Book(3, "����ȭ�����Ǿ����ϴ�", "������");
		Book book4 = new Book(4, "�������� �����϶�", "������");
		Book book5 = new Book(5, "���ǿ���", "�����϶�");

		//ArrayList ����
		
		//�����͸� ���� ���� �����
		//!ArrayList�� �迭�� �޸� ������ ũ�⸦ ���� ������ �ʿ䰡 ����,
		ArrayList<Book> shoppingCart = new ArrayList<Book>();
		
		//�߰� ���1
		//�����͸� �߰��ϱ�
		shoppingCart.add(book1);	//0
		shoppingCart.add(book2);	//1
		shoppingCart.add(book3);	//2
		shoppingCart.add(book4);	//3
		
		//ȭ�鿡 ���
		for (int i = 0; i < shoppingCart.size(); i++) {
			shoppingCart.get(i).showInfo();
		}
		System.out.println("--------=====--------");
		//�߰� ���2
		//�ε���2 ���ķ� �ִ°͵��� �ڷ� �и�
		shoppingCart.add(2,book5);
		
		//for ctrl+spacebar --> foreach��
		for (Book b : shoppingCart) {		
			b.showInfo();
		}
		System.out.println("--------=====--------");
		//�����ϱ�
		shoppingCart.remove(0);
		for(Book book: shoppingCart) {
			book.showInfo();
		}		
		System.out.println("--------=====--------");
		//���� ����
//		shoppingCart.clear();
		for(Book book: shoppingCart) {
			book.showInfo();
		}
		System.out.println("--------=====--------");
		//�����ϱ�
		shoppingCart.set(2, book1);
		for(Book b : shoppingCart) {			
			b.showInfo();
		}
		
		// C R U D
		//creat, read, update, delete
		
	}
	
	
	
}
