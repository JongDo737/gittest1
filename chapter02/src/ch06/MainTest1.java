package ch06;

//Ŭ������ ����ϴ� ����
public class MainTest1 {
	//�����Լ� ( �ڵ��� ������ )
	public static void main(String[] args) {
		
		Student studentLee = new Student(1,"Lee");
		studentLee.setKoreaSubject("����",100);
		studentLee.setMathSubject("����", 90);
		studentLee.showStudentScore();

		//�л� 2 ����
		Student studentShin = new Student(2,"Shin");
		studentShin.setKoreaSubject("����", 90);
		studentShin.setMathSubject("����", 90);
		studentShin.showStudentScore();
		
		//�л� 3 ����
		Student studentPark = new Student(3,"Park");
		studentPark.setKoreaSubject("����", 70);
		studentPark.setMathSubject("����", 60);
		studentPark.showStudentScore();
		
		
	}//end of main

}//end of class
