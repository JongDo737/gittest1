package ch02;

public class FunctionMainTest1 {

	public static void main(String[] args) {


		//�Լ� ��� ��� (��� ���߱�
		int add_result1 = add(10,77);
		System.out.println(add_result1);
		
		int add_result2 = add(10,30);
		System.out.println(add_result2);
	}// end of main

	// add �Լ��� ����
	public static int add(int num1, int num2) {

		int result;
		result = num1 + num2;
		return result; 
		//����Ű���带 ������ �� ������ ������� ��ȯ�Ѵ�.
	}

}
