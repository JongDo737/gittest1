package ch04;

public class Student {

	// ������ - constructor
	// ��ü�� �����Ҷ� ������ ���� ������� ������� �����ϴ� ��
	// (������ �ο���)

	int number;
	int grade;
	String name;

	// �⺻ ������
	// ����� ���� ������ ���� ��쿡��
	// �����Ϸ��� �˾Ƽ� �⺻ �����ڸ� ������ش�.
	public Student() {
		
	}

	// ������ ����� (�����ڰ� ���� ���� - ����� ���� ������)
	public Student(int num, int grade, String name) {
		number = num;
		// �Ű�����(��������) �̸��� ������� �̸��� ���ٸ�
		// this.Ű���带 ����ؼ� ������ �־���Ѵ�.
		this.name = name;
		this.grade = grade;
	}

	// �޼��� ����
	public void showInfo() {
		System.out.println(
				"�̸� : " + name + 
				"\n�й� : " + number + 
				"\n�г� : " + grade + "�г�");
	}
}
