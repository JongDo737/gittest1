package ch03;

public class ExceptionEx1 {

	public static void main(String[] args) {

		// 예외를 발생 시켜보자

		int[] arr = { 1, 2, 3, 4, 5 };
		
//		for (int i = 0; i < arr.length+5; i++) {
//			System.out.println(arr[i]);
//		}
		// java.lang.ArrayIndexOutOfBoundsException
		//실행도중 배열의 범위가 벗어났을 때 
		
		try {
			//예외가 발생할 코드를 try문에 작성을 한다.
			for (int i = 0; i < arr.length+5; i++) {
				System.out.println(arr[i]);
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외가 발생함 !");
		}
		
		System.out.println("비정상 종료되지 않았습니다.");
		
		// 프로그래밍이 종료되지 않고 계속 실행되어 진다. 
		
	}// end of main

}// end of class
