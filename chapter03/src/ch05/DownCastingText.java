package ch05;

public class DownCastingText {
	public static void main(String[] args) {
		
		//1. �ٳ����� origin ��� ������ �߰�
		
		Fruit fruit = new Banana();		//��ĳ����
		
		
//		fruit.origin;
		//�����Ϸ��� �θ�Ÿ�� �ν��Ͻ� ���� Ÿ����
		//�ٶ󺸰� �ִ� ���� �׷��� �ٳ����� ��������� ����� �� ����.
		
		//�ٿ� ĳ������ ����Ѵٸ� ����
		//(�����Ϸ����� �ڽ� ��ü Ÿ������ �ٶ󺸶�� ��� (��������ȯ�̶� �����)
		String origin = ((Banana)fruit).origin;
		System.out.println("������ : "+origin);
		
		//������ Ÿ��
		
		//��Ÿ��
		
		
	}//end of main
}// end of class
