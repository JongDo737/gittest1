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

//	// 1. 저글링이 질럿을 공격합니다.
//	public void attackZealot(Zealot zealot) {
//		if (zealot.getAlive()) {
//			System.out.println(name + "이 " + zealot.getName() + "을 공격합니다.");
//			System.out.println();
//			zealot.beAttacked(power);
//		}
//		else {
//			System.out.println(zealot.getName()+"는(은) 죽은 상태입니다.");
//			System.out.println();
//		}
//	}
//
//	// 2. 저글링이 마린을 공격합니다.
//	public void attackMarine(Marine marine) {
//		if (marine.getAlive()) {
//			System.out.println(name + "이 " + marine.getName() + "을 공격합니다.");
//			System.out.println();
//			marine.beAttacked(power);
//		}
//		else {
//			System.out.println(marine.getName()+"는(은) 죽은 상태입니다.");
//			System.out.println();
//		}
//	}

	public void beAttacked(int power) {
		this.hp -= power;
		if (hp <= 0) {
			setAlive(false);
			System.out.println(name + "이 죽었습니다.");
			System.out.println();
		}
	}

	public void showInfo() {
		System.out.println("====정보창====");
		System.out.println("이름 : " + name);
		System.out.println("전투력 : " + power);
		System.out.println("체력 : " + hp);
		System.out.println("===========");
		System.out.println();
	}

	public void attack(Zealot zealot) {
		if (zealot.getAlive()) {
			System.out.println(name + "이 " + zealot.getName() + "을 공격합니다.");
			System.out.println();
			zealot.beAttacked(power);
		} else {
			System.out.println(zealot.getName() + "는(은) 죽은 상태입니다.");
			System.out.println();
		}
	}

	public void attack(Marine marine) {
		if (marine.getAlive()) {
			System.out.println(name + "이 " + marine.getName() + "을 공격합니다.");
			System.out.println();
			marine.beAttacked(power);
		} else {
			System.out.println(marine.getName() + "는(은) 죽은 상태입니다.");
			System.out.println();
		}
	}
}