package ch01;

public class Book {

	// 멤버 변수
	int id;
	String title;
	String author;
	public Book() {}
	// 생성자
	public Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	//메서드
	public void showInfo() {
		System.out.println("책 번호 : "+id);
		System.out.println("책 이름 : "+title);
		System.out.println("책 작가 : "+author);
	}

}
