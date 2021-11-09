package ch12;

// 많이 사용하는 기본 클래스들 속한 패키지
import java.lang.*;

class Student{
	
	//toString();
	public String toString() {
		return "학생클래스";
	}
}

public class ObjectTest{ //extends Object 모든 클래스의 최상위 클래스
									// 자동으로 상속받음
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println(s1);
		String str1 = new String("안녕하세요");
		System.out.println(str1);
		
	}//end of main

}
