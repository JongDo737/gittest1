package ch06;

public class Student {

	int studentId;
	String studentName;
	
	//우리가 설계한 클래스를 참조타입으로 사용한다.
	Subject korea;
	Subject math;
	//생성자
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		
		//참조 타입은 생성을 해야 사용할 수 있다. 이렇게도 가능
		//메모리에 존재하게 만들어야한다.
		korea= new Subject();
		math= new Subject();
	}
	//정보를 입력받는 메서드 생성 (국어 과목에 대한 정보 셋팅)
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
		
	}
	//(수학 과목에 대한 정보 셋팅)
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	// 학생의 총점을 화면에 출력하는 기능 만들기
	public void showStudentScore() {
		int total;
		total = korea.score+math.score;
		System.out.println(studentName +"학생의 총점은 "+total+"점 입니다.");
	}
	
	
	
}
