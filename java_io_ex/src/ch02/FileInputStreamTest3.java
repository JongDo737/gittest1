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
		//try catch ���ҽ�
		//�ڹ� jdk 9 ���� ���ĺ��� ��� ����
		try(FileInputStream fis = new FileInputStream("assets/input1.txt")){
			//try() ��ȣ �ȿ� ������ ������ �ڵ����� finally fis.close() ���ش�.
			int i;
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			System.err.println("������ �����ϴ�.");
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
