package ch03;

public class MainTest1 {
	//메인함수 (코드의 시작점)
	public static void main(String[] args) {
		
		//대입 연산자(=)
		int number = 10;
		// '=' 수학기호화 달리 변수나 값을 대입하는 연산자 입니다.
		// 연산의 방향은 오른쪽에서 왼쪽으로 연산이 됩니다.
		
		int number2 = number;
		System.out.println(number);
		System.out.println(number2);
		System.out.println("==============");
		
		//부호 연산자 ( + , - )
		//부호를 변경하는 연산자입니다.
		//단 변수에 들어있는 실제 값을 변경한 상태는 아닙니다.
		
		System.out.println(-number);
		System.out.println("number의 현재 값 : " + number);
		
		number = -number;
		System.out.println(number);
		//변수에 실제 값을 변경하려면 대입 연산자를 함께 사용해야한다.
	}//end of main

}//end of class
