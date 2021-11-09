package ex01;

//new Ű���带 ����ؼ� �޸𸮿� �ø��� ����.
//����� ������ ����ϸ� ���������� ������
public abstract class Unit {
	protected int power;
	protected int hp;
	protected String name;
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
		this.hp -= power; // ü���� ���������� ���� ����.
		if (hp <= 0) { // ü���� 0���Ϸ� �������� ����
			setAlive(false);
			System.out.println(name + "�� �׾����ϴ�.");
			System.out.println();
		}
	}

	public void showInfo() {
		System.out.println("====����â====");
		System.out.println("�̸� : " + name);
		System.out.println("���ݷ� : " + power);
		System.out.println("ü�� : " + hp);
		System.out.println("===========");
		System.out.println();
	}

	// �޼��� �����ε��� ����غ���
	// �ٸ����� ������ Ÿ���̳�, �Ű����� ����, �Ű����� ������ �ٸ��� �̸��� ���Ƶ� ������ �� ����
	public void attack(Unit unit) {
		if (unit.getAlive()) {
			System.out.println(name + "�� " + unit.getName() + "�� �����մϴ�.");
			System.out.println();
			unit.beAttacked(power);
		} else {
			System.out.println(unit.getName() + "��(��) ���� �����Դϴ�.");
			System.out.println();
		}
	}

}
