package ch10;

public class Zealot {

	private int power;
	private int hp;
	private String name;
	private boolean alive;

	public Zealot(String name) {
		this.name = name;
		this.power = 10;
		this.hp = 100;
		this.alive = true;
	}

	// get() set()�޼���
	public String getName() {
		return name;
	}

	public boolean getAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	// ���� �մϴ�. -> ������ ������ �����ϴ� ����
	// �߿� - �ٸ� ��ü�� ��ȣ�ۿ� - �޼���� �������� ����
//	public void attackMarine(Marine marine) {			//���� ����Ŭ��������
//		if (marine.getAlive()) {	//����ִٸ� ����
//			System.out.println(name + "�� " + marine.getName() + "�� �����մϴ�.");
//			System.out.println();
//			marine.beAttacked(power);
//		}
//		else {	//���� ����
//			System.out.println(marine.getName()+"��(��) ���� �����Դϴ�.");
//			System.out.println();
//		}
//	}
//
//	public void attackZergling(Zergling zergling) {
//		if (zergling.getAlive()) {	//����ִٸ� ����
//			System.out.println(name + "�� " + zergling.getName() + "�� �����մϴ�.");
//			System.out.println();
//			zergling.beAttacked(power);
//		}
//		else {
//			System.out.println(zergling.getName()+"��(��) ���� �����Դϴ�.");
//			System.out.println();
//		}
//	}

	// ���� ���մϴ�.
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
	public void attack(Marine marine) {
		if (marine.getAlive()) { // ����ִٸ� ����
			System.out.println(name + "�� " + marine.getName() + "�� �����մϴ�.");
			System.out.println();
			marine.beAttacked(power);
		} else { // ���� ����
			System.out.println(marine.getName() + "��(��) ���� �����Դϴ�.");
			System.out.println();
		}
	}

	public void attack(Zergling zergling) {
		if (zergling.getAlive()) { // ����ִٸ� ����
			System.out.println(name + "�� " + zergling.getName() + "�� �����մϴ�.");
			System.out.println();
			zergling.beAttacked(power);
		} else {
			System.out.println(zergling.getName() + "��(��) ���� �����Դϴ�.");
			System.out.println();
		}
	}

}