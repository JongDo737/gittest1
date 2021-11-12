package ch01;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {
		
		System.out.println("알파벳 하나를 쓰고 Enter를 누르세요");
		
		int i;
		
		try {
			//입력 (바이트 단위로 읽음)
			i = System.in.read();		// 입력을 기다리는 명령어
			
			// 출력
			System.out.println("입력받은 값 : " + i);
			//문제 1
			//화면에 i 값을 A로 출력 해주세요.
			System.out.println((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
