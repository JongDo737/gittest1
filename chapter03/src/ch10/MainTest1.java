package ch10;

public class MainTest1 {
	public static void main(String[] args) {
		
		//부모타입 Calc
		Calc calc = new CompleteCalc();
		
		int num1 = 10;
		int num2 = 2;
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.defive(num1, 0));
		System.out.println(calc.times(num1, num2));
		
		// Calc의 showInfo()를 지운상태
		//오류 해결
		((CompleteCalc) calc).showInfo();
	}
}
