package ch10;

public interface Calc {

	double PI = 3.14;
	int ERROR = -99999;
	
	//추상 메서드
	// add, 매개변수 num1, num2+
	//substract, 매개변수 num1, num2 -
	//times 매개변수 num1, num2 *
	//devide 매개변수 num1, num2 /
	//리턴타입 int
	//showInfo();
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int defive(int num1, int num2);
	
}
