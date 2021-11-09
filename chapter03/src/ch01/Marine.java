package ch01;

public class Marine {

	private int power;
	private int hp;
	private String name;
	private boolean alive;

	public Marine(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 100;
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
//	public void attackZergling(Zergling zergling) {
//		if (zergling.getAlive()) {
//			System.out.println(name + "�� " + zergling.getName() + "�� �����մϴ�.");
//			System.out.println();
//			zergling.beAttacked(power);
//		}
//		else {
//			System.out.println(zergling.getName()+"��(��) ���� �����Դϴ�.");
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

	// �����ε�
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

	public void attack(Zergling zergling) {
		if (zergling.getAlive()) {
			System.out.println(name + "�� " + zergling.getName() + "�� �����մϴ�.");
			System.out.println();
			zergling.beAttacked(power);
		} else {
			System.out.println(zergling.getName() + "��(��) ���� �����Դϴ�.");
			System.out.println();
		}
	}

}