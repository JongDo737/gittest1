package ch01;
//����� �л�Ŭ������ ����غ��� ����.
public class StudentMainTest1 {
	//main �Լ�(�ڵ��� ������)
	public static void main(String[] args) {

		Student s1;
		Student s2;
		
		s1 = new Student();
		//new ������ heap���� ����, �ּҰ��� s1�̶�� ���������� ����
		s2 = new Student();
		
		System.out.println(s1); //�ּҰ�Ȯ��
		System.out.println(s2);

	}//end of main

}//end of class
