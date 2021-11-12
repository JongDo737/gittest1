package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("assets/input1.txt")){
			
			int i;
			while((i = fis.read())!= -1) {
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
