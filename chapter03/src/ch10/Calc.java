package ch10;

public interface Calc {

	double PI = 3.14;
	int ERROR = -99999;
	
	//�߻� �޼���
	// add, �Ű����� num1, num2+
	//substract, �Ű����� num1, num2 -
	//times �Ű����� num1, num2 *
	//devide �Ű����� num1, num2 /
	//����Ÿ�� int
	//showInfo();
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int defive(int num1, int num2);
	
}
