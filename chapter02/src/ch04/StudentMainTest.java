package ch04;

public class StudentMainTest {
	// 메인함수 (코드의 시작점)
	public static void main(String[] args) {

		Student s1 = new Student(1, 3, "홍길동");
		System.out.println(s1.number);
		System.out.println(s1.name);
		System.out.println(s1.grade);

		s1.showInfo();
        System.out.println("------");
		// 기본생성자로 객체 생성해보기
		Student s2 = new Student();
		
		s2.number = 2;
		s2.name = "이순신";
		s2.grade =2;
		
		System.out.println(s2.number);
		System.out.println(s2.name);
		System.out.println(s2.grade);
		
	}// end of main

}// end of class
