package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		try(FileOutputStream fos = new FileOutputStream("output4.txt")){
			
			//스캐너로 입력받아서 텍스트파일
			byte[] bs = new byte[26];
			System.out.println("문자를 입력하세요");
			input = sc.nextLine();
			for(int i=0;i<input.length();i++) {
				bs[i] = (byte)input.charAt(i);
			}
			fos.write(bs);
			
//			byte[] bs = new byte[26];
//			byte data = 65;
//			for(int i =0; i<bs.length;i++) {
//				bs[i] = data;
//				data++;
//			}
//			fos.write(bs, 2, 10);	//배열 2번째부터 10개 바이트 출력하기
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		System.out.println("출력이 완료 되었습니다.");
		
	}//end of main

}
