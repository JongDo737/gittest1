package ch01;

public class WarriorMainTest {
	// ����� Ŭ������ ����ϴ� �ڵ�
	public static void main(String[] args) {

		int height; // ��������

		Warrior w1 = new Warrior(); // heap �޸𸮿� ����
		// ����Ÿ���� �ּҰ��� ����.
		// ��ü : new Warrior
		// �޸𸮼��� �����ϴ� ���� ��ü(�ν��Ͻ�)
		w1.height = 200;
		// '.' ������
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
