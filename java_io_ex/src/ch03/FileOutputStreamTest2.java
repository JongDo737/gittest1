package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("output2.txt");
		try {
			try(fos){
				
				//����
				byte[] bs = new byte[26];
				byte data = 65; //'A'�� �ƽ�Ű��
				for(int i=0; i<bs.length;i++) {
					bs[i] = data;
					data++;
				}
				fos.write(bs);		//�迭�ȿ� �ִ� �����͸� �ѹ��� ����ϱ�
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}