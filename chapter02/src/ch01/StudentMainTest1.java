package ch01;
//설계된 학생클래스를 사용해보는 입장.
public class StudentMainTest1 {
	//main 함수(코드의 시작점)
	public static void main(String[] args) {

		Student s1;
		Student s2;
		
		s1 = new Student();
		//new 만나면 heap에서 생성, 주소값을 s1이라는 지역변수에 담음
		s2 = new Student();
		
		System.out.println(s1); //주소값확인
		System.out.println(s2);

	}//end of main

}//end of class
