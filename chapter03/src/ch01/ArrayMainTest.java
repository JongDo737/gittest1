package ch01;

import java.nio.file.spi.FileSystemProvider;

public class ArrayMainTest {

	public static void main(String[] args) {

		// 배열
		// 배열이란 연관된 데이터를 모아서 통으로 관리하기 위해 사용하는 데이터 타입니다.
		// 변수가 하나의 데이터를 저장하기 위한 것이라면 배열은 여러개의 데이터를 하나의 변수에
		// 저장하기 위한것이라고 할 수 있다.
		// 모든 프로그래밍 언어에서는 인덱스의 번호는 0부터 시작한다.
		// 배열을 사용할때 보통 for문과 관계해서 많이 사용합니다.
		
		//변수 선언
		int number = 10;

		// 배열 선언 방법
		int[] arr1 = new int[3];
		int arr2[] = new int[10];

		// 초기화 하는 방법 ( 값을 넣는 방법 )
		
		arr1[0] = 33;
		arr1[1] = 10;
		arr1[2] = 11;

		// 배열 선언과 동시에 초기화
		int[] numbers1 = new int[] { 11, 20, 30 };
		int[] numbers2 = { 10, 50, 100 };

		// 출력방법
		System.out.println(numbers1[0]);
		System.out.println(numbers1[1]);
		System.out.println(numbers1[2]);

		// 주소값
		System.out.println(numbers1);

		//
		String[] strArr = new String[10];
		strArr[0] = "야스오";
		strArr[1] = "티모";
		strArr[2] = "애쉬";
		strArr[3] = "다리우스";

		// 출력하기
		System.out.println(strArr[0]); // 야스오
		System.out.println(strArr[1]); // 티모
		System.out.println(strArr[2]); // 애쉬
		System.out.println(strArr[3]); // 다리우스
		System.out.println(strArr[4]); // null
		//for문 이용 null값 출력X
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i] != null) {
				System.out.println(strArr[i]);				
			}
		}
		
		// 배열 자체의 길이
		System.out.println(strArr.length);
		// 배열 첫번째 인덱스의 길이(String의 길이)
		System.out.println(strArr[0].length());

		

	}

}
