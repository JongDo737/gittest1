package ch01;

public class Book {

	// ��� ����
	int id;
	String title;
	String author;
	public Book() {}
	// ������
	public Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	//�޼���
	public void showInfo() {
		System.out.println("å ��ȣ : "+id);
		System.out.println("å �̸� : "+title);
		System.out.println("å �۰� : "+author);
	}

}
