package Ex01;

public class Zerg {// �������
	String userName;
	int dron = 4;
	int unitCount = 4;
	int population = 10;
	int mineral = 50;
	int gas;
	int zergling;
	int hydra;
	int attackPower; // ���������� ������ + , ���濡�� ������ �Ҷ� �����¼�ġ���ҷ��� �����.
	int hatcheryHP = 8;
	String chat;
	String build = "��ó��";

	// ������
	public Zerg(String userName) {
		this.userName = userName;
	}
	// �޼���

	// �����
	void buildings(String build) {
		this.build += " " + build;
		System.out.println(build + "��(��) �����ϴ�.");
		System.out.println("---------------------------------");
		if (build.equals("�����ε�")) {
			population += 8;
		}
	}

	// �ڿ� ĳ��
	void dig() {
		System.out.println(userName + " : " + "�ڿ��� ĸ�ϴ�.");
		System.out.println("---------------------------------");
		mineral += dron * 50; // �̳׶�ĳ�⸦ �ϸ� ��д� 10���� �ش�.
		gas += dron * 30; // �̳׶�ĳ�⸦ �ϸ� ��д� 8������ �ش�.
	}

	// ����
	void produce(String product) {
		System.out.println(product + "��(��) �����մϴ�.");
		System.out.println("---------------------------------");
		if (product.equals("dron")) {
			if (mineral >= 50) { // �̳׶��� �����ϸ� ����Ұ�
				mineral -= 50; // �̳׶� ����
				dron++; // dron 1����
				unitCount += 1; // �α��� 1����
			} else {
				System.out.println("Not Enough Minerals");
				System.out.println("---------------------------------");
			}
		} else if (product.equals("���۸�")) {
			if (zergling >= 50) {
				mineral -= 50;
				zergling++;
				unitCount += 1;
				attackPower += 1;
			} else {
				System.out.println("Not Enough Minerals");
				System.out.println("---------------------------------");
			}

		} else if (product.equals("�����")) {
			if (mineral >= 75 && gas >= 25) {
				mineral -= 75;
				gas -= 250;
				hydra++;
				unitCount += 2;
				attackPower += 2;
			}

			else {
				System.out.println("Not Enough Minerals");
				System.out.println("---------------------------------");
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.println("---------------------------------");
		}
	}

	// ����
	void attack() { // ������ ��ġ ��ȯ
		System.out.println("���濡�� �����մϴ�.");
		System.out.println("---------------------------------");
	}

	// ���ݹ���
	void beAttacked(int damage) {
		hatcheryHP -= damage;
	}

	// ����
	void gameInfo() {
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("�г��� : " + userName);
		System.out.println("���� �ڿ� \n�̳׶� : " + mineral + " ���� : " + gas);
		System.out.println("�α��� : " + unitCount + " / " + population);
		System.out.println("���� ���� : \n��� : " + dron + "\n���۸� : " + zergling + "\n����� : " + hydra);
		System.out.println("�ǹ��� : " + build);
		System.out.println("������ : "+attackPower);
		System.out.println("��ó�� ü�� : " + hatcheryHP);
		System.out.println("---------------------------------");
		System.out.println();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	// ä��
	void doChat(String chat) {
		System.out.println(userName + "���� ä���� �Է��ϼ̽��ϴ�.\n\n" + userName + " : " + chat);
		System.out.println("---------------------------------");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
