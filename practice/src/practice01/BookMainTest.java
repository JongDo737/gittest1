package practice01;


public class BookMainTest {

	public static void main(String[] args) {
		Book[] book = new Book[5];
		
		book[0] = new Book(1, "�帣�� ����ó��", "�Ŀ���ڿ���");
		book[1] = new Book(2, "�÷���UI����", "���ȣ");
		book[2] = new Book(3, "����ȭ�����Ǿ����ϴ�", "������");
		book[3] = new Book(4, "�������� �����϶�", "������");
		book[4] = new Book(5, "���ǿ���", "�����϶�");
		
		Book[] shoppingCart = new Book[book.length];
		
		shoppingCart[0] = book[2];
		shoppingCart[1] = book[3];
		shoppingCart[2] = book[4];
		
		for(Book b : shoppingCart) {
			if(b !=null) {
				b.showInfo();
			}
		}
		
		
		
	}

}
