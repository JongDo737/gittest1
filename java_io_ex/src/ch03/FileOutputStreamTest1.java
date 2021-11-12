package ch03;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		
		//바이트 단위로 파일에 쓰는 녀석
		try(FileOutputStream fos = new FileOutputStream("output.txt")){	//파일이 없으면 생성해줌
			
			fos.write(65);
			fos.write(66);
			fos.write(67);
			fos.write(68);
			fos.write(69);
			
		}  catch (IOException e) {
			System.out.println(e);
		}

	}

}
