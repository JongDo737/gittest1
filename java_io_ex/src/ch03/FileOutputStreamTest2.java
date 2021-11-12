package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("output2.txt");
		try {
			try(fos){
				
				//문제
				byte[] bs = new byte[26];
				byte data = 65; //'A'의 아스키값
				for(int i=0; i<bs.length;i++) {
					bs[i] = data;
					data++;
				}
				fos.write(bs);		//배열안에 있는 데이터를 한번에 출력하기
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}