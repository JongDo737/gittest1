package ch03;

public class MainTest7 {
	// 메인함수 (코드의 시작점)
	public static void main(String[] args) {
		// 복합 대입 연산자
		// 대입 연산자와 다른 연산자가 함께 사용

		int num1 = 1;
		num1 = num1 + 10;
		// 두개 동일하다.
		int num2 = 1;
		num2 += 10;

		int num3 = 1;
//		num3 = num3 -10;
//		복합 대입 연산자로 변경
		num3 -= 10;
		// num3 변수의 값은 현재 -9

		// num3 변수에 곱하기 2 를해서 num변수 결과값을 담아주세요.
		// 단, 복합 대입 연산자를 사용

		num3 *= 2;
		num3 = num3 * 2;

		// num3 변수에 나누기 2 를해서 num변수 결과값을 담아주세요.
		// 단, 복합 대입 연산자를 사용

		num3 /= 2;
		num3 = num3 / 2;

		// num3 변수에 나머지연산자 2 를해서 num변수 결과값을 담아주세요.
		// 단, 복합 대입 연산자를 사용

		num3 %= 2;
		num3 = num3 % 2;

	}// end of main

}// end of class
