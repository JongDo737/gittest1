package ch12;

public class MainTest {

	public static void main(String[] args) {
		
		Book book1 = new Book(1,"���̾�","�츣�� �켼");
		Book book2 = new Book(2,"���̾�","�츣�� �켼");

		
		System.out.println(book1 == book2);
		
		//equals ( ���ڿ��� ���Ҷ� ����ϴ� �޼��� ) : �ּҰ��� ����
		//�׷��� new�� ������ String�� �ٸ��� ��� ����
		boolean result = "abc".equals("abc");
		System.out.println(result);
		//true
		System.out.println("a"=="a");
		
		
		//equals �޼��带 ������ �ߴ�. (book Ŭ���� �ȿ���)
		if(book1.equals(book2)) { 
			System.out.println("���� å�Դϴ�.");
		}else {
			System.out.println("�ٸ� å�Դϴ�.");
		}
		
	}

}
