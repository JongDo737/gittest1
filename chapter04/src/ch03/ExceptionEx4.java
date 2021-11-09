package ch03;

import java.util.logging.Logger;

class Student {
	String name;
	int grade;
}

public class ExceptionEx4 {

	public static void main(String[] args) {
		
		//로그 남기기
		Logger logger = Logger.getLogger("myLogger");
		
		Student student = null;
		try {
			student.name = "홍길동";
			
		} catch (Exception e) {
//			System.out.println("오류 발생");
			logger.warning("오류발생 : "+e.toString());
		}
		System.out.println("비정상 종료 되지 않음");
	}

}
