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
			
			//��ĳ�ʷ� �Է¹޾Ƽ� �ؽ�Ʈ����
			byte[] bs = new byte[26];
			System.out.println("���ڸ� �Է��ϼ���");
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
//			fos.write(bs, 2, 10);	//�迭 2��°���� 10�� ����Ʈ ����ϱ�
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		System.out.println("����� �Ϸ� �Ǿ����ϴ�.");
		
	}//end of main

}
