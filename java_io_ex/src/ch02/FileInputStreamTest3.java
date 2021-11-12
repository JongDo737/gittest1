package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		
//		try {
//			
//		} catch (Exception e) {
//			
//		}
		//try catch 리소스
		//자바 jdk 9 버전 이후부터 사용 가능
		try(FileInputStream fis = new FileInputStream("assets/input1.txt")){
			//try() 괄호 안에 구문을 넣으면 자동으로 finally fis.close() 해준다.
			int i;
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			System.err.println("파일이 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
