package ch08;

public class Unit {
	int power;
	int hp;
	String name;
	private boolean alive;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public boolean getAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public void beAttacked(int power) {
		this.hp -= power; // 체력이 남아있으면 공격 받음.
		if (hp <= 0) { // 체력이 0이하로 내려가면 죽음
			setAlive(false);
			System.out.println(name + "이 죽었습니다.");
			System.out.println();
		}
	}

	public void showInfo() {
		System.out.println("====정보창====");
		System.out.println("이름 : " + name);
		System.out.println("공격력 : " + power);
		System.out.println("체력 : " + hp);
		System.out.println("===========");
		System.out.println();
	}

	// 메서드 오버로딩을 사용해보자
	// 다른형태 데이터 타입이나, 매개변수 갯수, 매개변수 종류가 다르면 이름이 같아도 선언할 수 있음
	public void attack(Unit unit) {
		if (unit.getAlive()) {
			System.out.println(name + "이 " + unit.getName() + "을 공격합니다.");
			System.out.println();
			unit.beAttacked(power);
		} else {
			System.out.println(unit.getName() + "는(은) 죽은 상태입니다.");
			System.out.println();
		}
	}

}
