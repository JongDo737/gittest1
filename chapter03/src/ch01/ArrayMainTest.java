package ch01;

import java.nio.file.spi.FileSystemProvider;

public class ArrayMainTest {

	public static void main(String[] args) {

		// �迭
		// �迭�̶� ������ �����͸� ��Ƽ� ������ �����ϱ� ���� ����ϴ� ������ Ÿ�Դϴ�.
		// ������ �ϳ��� �����͸� �����ϱ� ���� ���̶�� �迭�� �������� �����͸� �ϳ��� ������
		// �����ϱ� ���Ѱ��̶�� �� �� �ִ�.
		// ��� ���α׷��� ������ �ε����� ��ȣ�� 0���� �����Ѵ�.
		// �迭�� ����Ҷ� ���� for���� �����ؼ� ���� ����մϴ�.
		
		//���� ����
		int number = 10;

		// �迭 ���� ���
		int[] arr1 = new int[3];
		int arr2[] = new int[10];

		// �ʱ�ȭ �ϴ� ��� ( ���� �ִ� ��� )
		
		arr1[0] = 33;
		arr1[1] = 10;
		arr1[2] = 11;

		// �迭 ����� ���ÿ� �ʱ�ȭ
		int[] numbers1 = new int[] { 11, 20, 30 };
		int[] numbers2 = { 10, 50, 100 };

		// ��¹��
		System.out.println(numbers1[0]);
		System.out.println(numbers1[1]);
		System.out.println(numbers1[2]);

		// �ּҰ�
		System.out.println(numbers1);

		//
		String[] strArr = new String[10];
		strArr[0] = "�߽���";
		strArr[1] = "Ƽ��";
		strArr[2] = "�ֽ�";
		strArr[3] = "�ٸ��콺";

		// ����ϱ�
		System.out.println(strArr[0]); // �߽���
		System.out.println(strArr[1]); // Ƽ��
		System.out.println(strArr[2]); // �ֽ�
		System.out.println(strArr[3]); // �ٸ��콺
		System.out.println(strArr[4]); // null
		//for�� �̿� null�� ���X
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i] != null) {
				System.out.println(strArr[i]);				
			}
		}
		
		// �迭 ��ü�� ����
		System.out.println(strArr.length);
		// �迭 ù��° �ε����� ����(String�� ����)
		System.out.println(strArr[0].length());

		

	}

}
