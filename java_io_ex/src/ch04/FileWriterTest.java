package ch04;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {

		// 문자열 타입으로 파일을 쓰는녀썩
		try (FileWriter fw = new FileWriter("writer.txt", true)) {		//뒤에가 true면 추가해서 글을 쓰고 없으면 덮어쓰기 됌

//			fw.write('A');
			char buf[] = { 'B', 'C', 'D', 'E', 'F', 'G' };
			fw.write(buf, 1, 5); // 1부터 5개만 글을 써라 !

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
