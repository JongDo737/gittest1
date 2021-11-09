package ch03;

class A {
	int number1;
	int number2;
}

class B {
	int number1;
	int number2;
	int number3;
}

class C extends A { // »ó¼Ó

	int number3;
	int number4;

}

public class MainTest1 {

	public static void main(String[] args) {
		C c = new C();
		c.number1 = 1;
		c.number2 = 2;
		c.number3 = 3;
		c.number4 = 4;

		System.out.println(c.number1);
		System.out.println(c.number2);

	}

}
