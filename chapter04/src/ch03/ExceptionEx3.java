package ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

class MyException{
	String fileName;
	
	public MyException(String fileName) {
		this.fileName = fileName;
	}
	
	//throws 란
	public String readFile() throws IOException {
		FileInputStream fis = new FileInputStream(fileName);
		//FileNotFoundException
		Properties prop = new Properties();
		prop.load(fis);
		//IOException (입출력 최상위 클래스)
		String dbType = prop.getProperty("DBTYPE");
		return dbType;
	}
}

public class ExceptionEx3 {
	public static void main(String[] args) {
		
		//객체생성
		MyException exception = new MyException("a.txt");
		
		// 사용하는 입장에서 예외처리를 직접 해결해야한다.
		try {
			String temp = exception.readFile();
			System.out.println("temp = "+temp);
		} catch (IOException e) {
			System.out.println("파일이 없습니다. 파일을 확인해 주세요");
		}
		
	}
}
