package ch06;

public class Student {

	int studentId;
	String studentName;
	
	//�츮�� ������ Ŭ������ ����Ÿ������ ����Ѵ�.
	Subject korea;
	Subject math;
	//������
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		
		//���� Ÿ���� ������ �ؾ� ����� �� �ִ�. �̷��Ե� ����
		//�޸𸮿� �����ϰ� �������Ѵ�.
		korea= new Subject();
		math= new Subject();
	}
	//������ �Է¹޴� �޼��� ���� (���� ���� ���� ���� ����)
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
		
	}
	//(���� ���� ���� ���� ����)
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	// �л��� ������ ȭ�鿡 ����ϴ� ��� �����
	public void showStudentScore() {
		int total;
		total = korea.score+math.score;
		System.out.println(studentName +"�л��� ������ "+total+"�� �Դϴ�.");
	}
	
	
	
}
