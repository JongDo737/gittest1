package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest4 {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("assets/input1.txt")) {

			byte[] bs = new byte[10];
			int i;
			while ((i = fis.read(bs)) != -1) {		//fis.read(bs) �ѹ��� bs[] ����Ʈ������ŭ �о��
				for(int j=0;j<i; j ++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(" : "+i+"����Ʈ ����");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("������ �����ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
