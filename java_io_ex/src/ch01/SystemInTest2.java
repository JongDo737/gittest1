package ch01;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {

		System.out.println("알파벳 여러개 쓰고 Enter를 누르세요");

		int i;

		try {
			//바이트를 문자로 변경해주는 녀석
			//바이트 단위로 읽은 녀석을 문자 단위로 읽어 들이게 하는 녀석
			//보조 스트림
			InputStreamReader irs = new InputStreamReader(System.in);
			
			while((i=irs.read()) != '\n') {
				// 화면에 출력
				System.out.print((char)i);
			}
			
			// while 안에 식을 넣을 수 있음
			while ((i = System.in.read()) != '\n') { //  '\n' 는 Enter 키임
				// 화면에 출력
				System.out.print((char) i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
