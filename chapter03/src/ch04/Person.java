package ch04;

public class Person {
	//��ӱ����� ���鶧 �ؿ������� Person Teacher Studnet �� �� �������� Ȯ���� ��� ����
	//�׷��� �ʰ� ó������ �ٷ� ����� ������� ���߿� ��ȸ�� ���� ����.
	String name;
	int age;
	int weight;
	int height;
	
	public void showInfo() {
		System.out.println(name +"���� ����");
		System.out.println( "���� : "+age);
		System.out.println( "������ : "+weight);
		System.out.println( "Ű : "+height);
	}
}
