package ex01;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {
		System.out.println("알파벳 여러개 쓰고 Enter 누르세요");

		int i;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		try {
			while((i = isr.read()) != '\n') {
				System.out.println((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
