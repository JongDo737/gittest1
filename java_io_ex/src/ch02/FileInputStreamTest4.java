package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest4 {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("assets/input1.txt")) {

			byte[] bs = new byte[10];
			int i;
			while ((i = fis.read(bs)) != -1) {		//fis.read(bs) 한번에 bs[] 바이트개수만큼 읽어라
				for(int j=0;j<i; j ++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(" : "+i+"바이트 읽음");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("파일이 없습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
