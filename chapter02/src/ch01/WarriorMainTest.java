package ch01;

public class WarriorMainTest {
	// 설계된 클래스를 사용하는 코딩
	public static void main(String[] args) {

		int height; // 지역변수

		Warrior w1 = new Warrior(); // heap 메모리에 돌림
		// 참조타입은 주소값이 담긴다.
		// 객체 : new Warrior
		// 메모리세상에 존재하는 순간 객체(인스턴스)
		w1.height = 200;
		// '.' 연산자
		w1.power = 100;
		w1.name = "warrior_1";
		w1.color = "green";

		System.out.println(w1.height);
		System.out.println(w1.power);
		System.out.println(w1.name);
		System.out.println(w1.color);

		Warrior w2 = new Warrior();

		w2.height = 100;
		w2.power = 50;
		w2.name = "small_warrior_2";
		w2.color = "red";

		System.out.println(w2.height);
		System.out.println(w2.power);
		System.out.println(w2.name);
		System.out.println(w2.color);

	}// end of main

}// end of class
