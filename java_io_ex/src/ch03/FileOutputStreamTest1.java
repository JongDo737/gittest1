package ch03;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		
		//����Ʈ ������ ���Ͽ� ���� �༮
		try(FileOutputStream fos = new FileOutputStream("output.txt")){	//������ ������ ��������
			
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
