package ch11;

import java.util.Calendar;

public class MainTest {
	public static void main(String[] args) {

		// Company 객체를 생성해 보세요 5개.
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		Company company3 = Company.getInstance();
		Company company4 = Company.getInstance();
		Company company5 = Company.getInstance();

		// 화면에 주소값을 출력해 보세요.
		System.out.println(company1);
		System.out.println(company2);
		System.out.println(company3);
		System.out.println(company4);
		System.out.println(company5);
		//모두 주소값이 같음

//		Calendar c = new Calendar(); --> 싱글톤 패턴으로 이루어져 있음
		Calendar c = Calendar.getInstance();
		
		
	}
}