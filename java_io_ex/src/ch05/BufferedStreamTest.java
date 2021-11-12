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
			
			//보조스트림 사용해보기		--->   생성자로 기반 스트림을 넣어준다.
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			millisecond = System.currentTimeMillis();	//수행시작시간 확인
			
			int i;
			//기반스트림 사용코드
//			while( (i = fis.read())!=-1) {
//				fos.write(i);
//			}
			
			//보조 스트림 사용코드
			while((i = bis.read()) !=-1) {
				bos.write(i);
			}
			millisecond = System.currentTimeMillis() -millisecond;	//수행시간
			System.out.println("파일을 복사하는데 "+millisecond+" 소요 되었습니다.");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
