package ch03;

import java.util.Scanner;

public class MainTest6 {

	public static void main(String[] args) {
		//삼항 연산자
		//조건식 ? 결과1 : 결과2;
		//조건식이 참일경우 : 결과1 , 거짓일경우 : 결과2
		int num1 =(5>3) ? 10:20;
		System.out.println(num1);
		
		int num2 =(5<3) ? 10:20;
		System.out.println(num2);
		
		int max;
		System.out.println("입력받은 두 수중 큰 수를 출력하세요.");
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 1: ");
		int num3 =sc.nextInt();
		System.out.println("입력 2: ");
		int num4 =sc.nextInt();
		max = num3>num4 ? num3 : num4;
		System.out.println(max);
		
		
	}

}
