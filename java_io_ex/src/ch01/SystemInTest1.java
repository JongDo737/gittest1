package ch01;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {
		
		System.out.println("���ĺ� �ϳ��� ���� Enter�� ��������");
		
		int i;
		
		try {
			//�Է� (����Ʈ ������ ����)
			i = System.in.read();		// �Է��� ��ٸ��� ��ɾ�
			
			// ���
			System.out.println("�Է¹��� �� : " + i);
			//���� 1
			//ȭ�鿡 i ���� A�� ��� ���ּ���.
			System.out.println((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
