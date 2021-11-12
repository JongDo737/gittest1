package ch02;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("assets/input1.txt");
			int i;
			//while 문으로 처리를 합니다.
			//read()를 썼을 때  글자가 더이상 없으면 -1 반환
			while((i=fis.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//중요
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
