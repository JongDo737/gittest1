package ch01;

public class ArrayMainTest3 {

	public static void main(String[] args) {

		Book book1 = new Book(1, "�帣�� ����ó��", "�Ŀ���ڿ���");
		Book book2 = new Book(2, "�÷���UI����", "���ȣ");
		Book book3 = new Book(3, "����ȭ�����Ǿ����ϴ�", "������");
		Book book4 = new Book(4, "�������� �����϶�", "������");
		Book book5 = new Book(5, "���ǿ���", "�����϶�");

		// ����
		// �迭�� �̿��ؼ� shoppingCart ����(�迭)�� ��ü�� ��ƺ��ô�.

		Book[] shoppingCart = new Book[5];

		// 2. ������ å�� ��ٱ��Ͽ� ��ƺ���
		shoppingCart[0] = book1;
		shoppingCart[1] = book4;
		shoppingCart[2] = book5;

		// 3. ��ٱ��Ͽ� ���� ������ ȭ�鿡 ����ϼ���

		for (int i = 0; i < shoppingCart.length; i++) {
			if (shoppingCart[i] != null) {
				shoppingCart[i].showInfo();
				System.out.println();
			}
		}
		
		//4. ����
		shoppingCart[0] = book5;
		
		//5. �ε��� 1��°�� book3�߰����ּ���
		//0, 1=book3, 1-->2, 2-->3 , 
		shoppingCart[0]=book2;
		shoppingCart[1]=book3;
		shoppingCart[2]=book4;
		shoppingCart[3]=book5;
		//�迭�� �߰��� �Ҷ�� �ε��� ������ ���ؼ� ó���ؾ��Ѵ�.
		
		//���� -> �迭�� ����ִ� ���� ������
		shoppingCart[2] = null;
	}
}
