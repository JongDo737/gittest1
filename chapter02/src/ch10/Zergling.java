package ch10;

public class Zergling {

	private int power;
	private int hp;
	private String name;
	private boolean alive;

	public Zergling(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 50;
		this.alive = true;
	}

	public String getName() {
		return name;
	}

	public boolean getAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

//	// 1. ���۸��� ������ �����մϴ�.
//	public void attackZealot(Zealot zealot) {
//		if (zealot.getAlive()) {
//			System.out.println(name + "�� " + zealot.getName() + "�� �����մϴ�.");
//			System.out.println();
//			zealot.beAttacked(power);
//		}
//		else {
//			System.out.println(zealot.getName()+"��(��) ���� �����Դϴ�.");
//			System.out.println();
//		}
//	}
//
//	// 2. ���۸��� ������ �����մϴ�.
//	public void attackMarine(Marine marine) {
//		if (marine.getAlive()) {
//			System.out.println(name + "�� " + marine.getName() + "�� �����մϴ�.");
//			System.out.println();
//			marine.beAttacked(power);
//		}
//		else {
//			System.out.println(marine.getName()+"��(��) ���� �����Դϴ�.");
//			System.out.println();
//		}
//	}

	public void beAttacked(int power) {
		this.hp -= power;
		if (hp <= 0) {
			setAlive(false);
			System.out.println(name + "�� �׾����ϴ�.");
			System.out.println();
		}
	}

	public void showInfo() {
		System.out.println("====����â====");
		System.out.println("�̸� : " + name);
		System.out.println("������ : " + power);
		System.out.println("ü�� : " + hp);
		System.out.println("===========");
		System.out.println();
	}

	public void attack(Zealot zealot) {
		if (zealot.getAlive()) {
			System.out.println(name + "�� " + zealot.getName() + "�� �����մϴ�.");
			System.out.println();
			zealot.beAttacked(power);
		} else {
			System.out.println(zealot.getName() + "��(��) ���� �����Դϴ�.");
			System.out.println();
		}
	}

	public void attack(Marine marine) {
		if (marine.getAlive()) {
			System.out.println(name + "�� " + marine.getName() + "�� �����մϴ�.");
			System.out.println();
			marine.beAttacked(power);
		} else {
			System.out.println(marine.getName() + "��(��) ���� �����Դϴ�.");
			System.out.println();
		}
	}
}