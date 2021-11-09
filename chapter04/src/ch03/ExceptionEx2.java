package ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionEx2 {
	public static void main(String[] args) {
		
		FileInputStream fis;
		
		try {
			fis = new FileInputStream("a.txt");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		//catch는 여러번 사용가능하다.
		}catch(Exception e) {	//최상위 클래스 모든 예외를 다 처리해버림
			System.out.println("예외처리");
			return;	//심지어 리턴문이 있어도 finally가 실행된다.
		}finally {
			//try 문이 실행되면 반드시 실행 됌. (오류가 있건 없건)
			System.out.println("finall은 반드시 실행됩니다.");
		}
		
		System.out.println("비정상 종료되지 않았습니다.");
		
		
	}
}
