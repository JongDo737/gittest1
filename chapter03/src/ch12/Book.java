package ch12;

public class Book {
	
	private int bookId;
	private String title;
	private String author;
	
	public Book(int boodId, String title, String author) {
		this.bookId = boodId;
		this.title = title;
		this.author = author;
	}

	//toString 메서드 재정의해보기
	@Override
	public String toString() {
		
		return "[" + bookId + "번책]"+"\n[" + title + "]"+"\n[" + author + "]";
	}
	
	//책이름 작가까지 같아야 true
	//equals 재정의
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Book) {
			Book tempBook = (Book)obj;	//downcasting
			//논리적 설계
			if(this.title == tempBook.title && this.author == tempBook.author) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Book book1 = new Book(1, "데미안", "홍길동");
		String book = book1.toString();
		System.out.println(book);
	}
	
}
