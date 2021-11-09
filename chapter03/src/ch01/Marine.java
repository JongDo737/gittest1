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
//	public void attackZergling(Zergling zergling) {
//		if (zergling.getAlive()) {
//			System.out.println(name + "이 " + zergling.getName() + "을 공격합니다.");
//			System.out.println();
//			zergling.beAttacked(power);
//		}
//		else {
//			System.out.println(zergling.getName()+"는(은) 죽은 상태입니다.");
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

	// 오버로딩
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

	public void attack(Zergling zergling) {
		if (zergling.getAlive()) {
			System.out.println(name + "이 " + zergling.getName() + "을 공격합니다.");
			System.out.println();
			zergling.beAttacked(power);
		} else {
			System.out.println(zergling.getName() + "는(은) 죽은 상태입니다.");
			System.out.println();
		}
	}

}