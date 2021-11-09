package ch06;

//클래스를 사용하는 입장
public class MainTest1 {
	//메인함수 ( 코드의 시작점 )
	public static void main(String[] args) {
		
		Student studentLee = new Student(1,"Lee");
		studentLee.setKoreaSubject("국어",100);
		studentLee.setMathSubject("수학", 90);
		studentLee.showStudentScore();

		//학생 2 동작
		Student studentShin = new Student(2,"Shin");
		studentShin.setKoreaSubject("국어", 90);
		studentShin.setMathSubject("수학", 90);
		studentShin.showStudentScore();
		
		//학생 3 동작
		Student studentPark = new Student(3,"Park");
		studentPark.setKoreaSubject("국어", 70);
		studentPark.setMathSubject("수학", 60);
		studentPark.showStudentScore();
		
		
	}//end of main

}//end of class
