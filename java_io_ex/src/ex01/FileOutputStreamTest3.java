package ex01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		
		try(FileOutputStream fos = new FileOutputStream("output5.txt")){
			
			byte[] bs = new byte[26];
			System.out.println("문자를 입력하세요 >>");
			input = sc.nextLine();
			for(int i=0; i < input.length();i++) {
				bs[i]= (byte)input.charAt(i);
			}
			fos.write(bs);
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
