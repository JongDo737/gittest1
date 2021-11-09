package ch02;

import java.util.ArrayList;

import ch01.Book;

public class ArrayMainTest1 {
	public static void main(String[] args) {
		Book book1 = new Book(1, "흐르는 강물처럼", "파울로코엘료");
		Book book2 = new Book(2, "플러터UI실전", "김근호");
		Book book3 = new Book(3, "무궁화꽃이피었습니다", "김진명");
		Book book4 = new Book(4, "리딩으로 리드하라", "이지성");
		Book book5 = new Book(5, "사피엔스", "유발하라리");

		//ArrayList 선언
		
		//데이터를 담을 공간 만들기
		//!ArrayList는 배열과 달리 공간의 크기를 먼저 선언할 필요가 없다,
		ArrayList<Book> shoppingCart = new ArrayList<Book>();
		
		//추가 방법1
		//데이터를 추가하기
		shoppingCart.add(book1);	//0
		shoppingCart.add(book2);	//1
		shoppingCart.add(book3);	//2
		shoppingCart.add(book4);	//3
		
		//화면에 출력
		for (int i = 0; i < shoppingCart.size(); i++) {
			shoppingCart.get(i).showInfo();
		}
		System.out.println("--------=====--------");
		//추가 방법2
		//인덱스2 이후로 있는것들은 뒤로 밀림
		shoppingCart.add(2,book5);
		
		//for ctrl+spacebar --> foreach문
		for (Book b : shoppingCart) {		
			b.showInfo();
		}
		System.out.println("--------=====--------");
		//삭제하기
		shoppingCart.remove(0);
		for(Book book: shoppingCart) {
			book.showInfo();
		}		
		System.out.println("--------=====--------");
		//전부 삭제
//		shoppingCart.clear();
		for(Book book: shoppingCart) {
			book.showInfo();
		}
		System.out.println("--------=====--------");
		//수정하기
		shoppingCart.set(2, book1);
		for(Book b : shoppingCart) {			
			b.showInfo();
		}
		
		// C R U D
		//creat, read, update, delete
		
	}
	
	
	
}
