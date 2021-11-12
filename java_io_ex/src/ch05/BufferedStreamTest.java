package ch05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {
		
		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("a.zip")){
			FileOutputStream fos = new FileOutputStream("copy.zip");
			
			//������Ʈ�� ����غ���		--->   �����ڷ� ��� ��Ʈ���� �־��ش�.
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			millisecond = System.currentTimeMillis();	//������۽ð� Ȯ��
			
			int i;
			//��ݽ�Ʈ�� ����ڵ�
//			while( (i = fis.read())!=-1) {
//				fos.write(i);
//			}
			
			//���� ��Ʈ�� ����ڵ�
			while((i = bis.read()) !=-1) {
				bos.write(i);
			}
			millisecond = System.currentTimeMillis() -millisecond;	//����ð�
			System.out.println("������ �����ϴµ� "+millisecond+" �ҿ� �Ǿ����ϴ�.");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
